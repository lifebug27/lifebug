package com.lifebug.facevision.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "event")
public class Event {

    public Event(String eventTime, String eventDate, String eventName) {
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.eventName = eventName;
    }

    public Event() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "event_time")
    private String eventTime;

    @Column(name = "date")
    private String eventDate;

    @Column(name = "event_name")
    private String eventName;

    @ManyToOne()
    @JoinColumn(name = "org_id", referencedColumnName = "id")
    private Organiser organiser;

    @ManyToMany
    @JoinTable(name = "attendance",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "par_id"))
    private List<Participant> participants;

    public Organiser getOrganiser() {
        return this.organiser;
    }

    public void setOrganiser(Organiser organiser) {
        this.organiser = organiser;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) &&
                Objects.equals(eventTime, event.eventTime) &&
                Objects.equals(eventDate, event.eventDate) &&
                Objects.equals(eventName, event.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventTime, eventDate, eventName);
    }
}
