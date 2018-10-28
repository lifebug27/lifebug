package com.lifebug.facevision.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;

    @Type(type = "text")
    @Column(name = "photo")
    private String photo;

    public People() {
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return Objects.equals(id, people.id) &&
                Objects.equals(name, people.name) &&
                Objects.equals(status, people.status) &&
                Objects.equals(photo, people.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, photo);
    }
}
