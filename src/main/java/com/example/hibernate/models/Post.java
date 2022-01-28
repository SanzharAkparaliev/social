package com.example.hibernate.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    private Integer id;
    private LocalDateTime postDate;

    @ManyToOne
    @JoinColumn(name = "userid",insertable = false,updatable = false)
    private User user;
    private String Details;

    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Post(Integer id, LocalDateTime postDate, User user, String details) {
        this.id = id;
        this.postDate = postDate;
        this.user = user;
        Details = details;
    }


    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    @JsonBackReference
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
