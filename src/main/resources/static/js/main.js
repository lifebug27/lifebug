var messageApi = Vue.resource('/api/people{/id}');

Vue.component('message-form', {
    props: ['messages'],
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
            var message = {text: this.text};

            messageApi.save({}, message).then(result =>
                result.json().then(data => {
                    this.messages.push(data);
                    this.text = '';
                })
            )
        }
    }
});

Vue.component('message-row', {
    props: ['message'],
    template: '<div>' +
    '<i>({{ message.id }})</i> {{message.text}} ' +
    '<span>' +
    '<input type="button" value="Edit" v-on:click="edit" />' +
    '</span>' +
    '</div>',
    methods: {
        edit: function () {

        }
    }
});

Vue.component('messages-list', {
    props: ['messages'],
    data: function () {
        return{

        }
    },
    template:
    '<div>' +
    '<message-form :messages="messages" />' +
    '<message-row v-for = "message in messages" :key="message.id" :message="message">' +
    '{{message.text}}' +
    '</message-row>' +
    '</div>',
    created: function () {
        messageApi.get().then(result =>
            result.json().then(data =>
                data.forEach(message =>
                    this.messages.push(message)
                )
            )
        )
    },
    methods: {
        editMessage: function () {
            this.message = message;
        }
    }
});

var app = new Vue({
    el: '#app',
    template: '<messages-list :messages="messages" />',
    data: {
        messages: []
    }
});