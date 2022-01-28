package com.example.hibernate.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post>posts;

    public User(Integer id, String firstname, String lastname, Location location, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.email = email;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
