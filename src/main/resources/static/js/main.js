var peopleApi = Vue.resource('/api/people{/id}');

Vue.component('person-form', {
    props: ['people'],
    data: function () {
        return {
            text: ''
        }
    },
    template:
        '<div>' +
        '<input type="text" placeholder="Write something" v-model="text" />' +
        '<input type="button" value="Save" v-on:click="save" />' +
        '</div>',
    methods: {
        save: function () {
            let person = {text: this.name, status: this.status};

            peopleApi.save({}, person)
                .then(result =>
                    result.json()
                        .then(data => {
                            this.people.push(data);
                            this.name = '';
                            this.status = '';
                        })
                )
        }
    }
});

Vue.component('person-row', {
    props: ['person'],
    template:
        '<div style="width: 518px">' +
        // '<td>({{ person.id }})</td> ' +
        '<tr><td>{{person.name}}</td> ' +
        '<td>{{person.status}}</td></tr> ' +
        // '<span>' +
        // '<input type="button" value="Edit" v-on:click="edit" />' +
        // '</span>' +
        '</div>',
    methods: {
        edit: function () {

        }
    }
});

Vue.component('people-list', {
    props: ['people'],
    data: function () {
        return {}
    },
    template:
        '<div>' +
        '<person-form :people="people" style="display:none;"/>' +
        '<table class="table">' +
        '<tbody>' +
        '<person-row v-for = "person in people" :key="person.id" :person="person">' +
        '{{person.name}}' +
        '</person-row>' +
        '</tbody>' +
        '</table>' +
        '</div>',
    created: function () {
        peopleApi.get()
            .then(result => result.json()
                .then(data =>
                    data.forEach(person => {
                            this.people.push(person);

                        }
                    )
                )
            )
    },
    methods: {
        editMessage: function () {
            this.person = person;
        }
    }
});

var app = new Vue({
    el: '#app',
    template: '<people-list :people="people" />',
    data: {
        people: []
    }
});
