package com.lifebug.facevision.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "participant")
public class Participant {

    public Participant(String firstName, String secondName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    public Participant() {
    }

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

    @Column(name = "photo")
    private String photo;

    private List<Event> events;

    @ManyToMany
    @JoinTable(name="attendance",
            joinColumns=@JoinColumn(name="event_id_id"),
            inverseJoinColumns=@JoinColumn(name="par_id"))
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant)) return false;
        Participant that = (Participant) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(secondName, that.secondName) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(telNumber, that.telNumber) &&
                Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        int result = hash(id, firstName, secondName, patronymic, telNumber, photo);
        return result;
    }
}
