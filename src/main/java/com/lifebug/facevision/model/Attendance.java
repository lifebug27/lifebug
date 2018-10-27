package com.lifebug.facevision.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "attendance")
@Entity
public class Attendance {

    public Attendance(Integer parId, Integer eventId, String status) {
        this.parId = parId;
        this.eventId = eventId;
        this.status = status;
    }

    public Attendance() {
    }

    @Column(name = "id")
    private Integer id;

    @Column(name = "par_id")
    private Integer parId;

    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "status")
    private String status;

    public Integer getParId() {
        return parId;
    }

    public void setParId(Integer parId) {
        this.parId = parId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attendance)) return false;
        Attendance that = (Attendance) o;
        return Objects.equals(parId, that.parId) &&
                Objects.equals(eventId, that.eventId) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parId, eventId, status);
    }
}
