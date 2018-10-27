package com.lifebug.facevision.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organiser")
public class Organiser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "telephone_number")
    private String telNumber;

    public Organiser(String firstName, String secondName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    public Organiser() {
    }

//    private List<Event> events;
//
//    @Lob
//    @Basic(fetch = LAZY)
//    @Column(name = "photo")
//    private String photo;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organiser", cascade = CascadeType.ALL)
//    public List<Event> getEvents() {
//        return events;
//    }

//    public void addEvent(Event event){
//        events.add(event);
//    }
//
//    public void setEvents(List<Event> events) {
//        this.events = events;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Organiser)) return false;
        Organiser organiser = (Organiser) o;
        return Objects.equals(id, organiser.id) &&
                Objects.equals(firstName, organiser.firstName) &&
                Objects.equals(secondName, organiser.secondName) &&
                Objects.equals(patronymic, organiser.patronymic) &&
                Objects.equals(telNumber, organiser.telNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, patronymic, telNumber);
    }
}
