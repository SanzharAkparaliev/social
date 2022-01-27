package com.example.hibernate.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Location {
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "location")
    private List<User> users;

    public Location(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Location() {
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
}
