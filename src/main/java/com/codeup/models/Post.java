package com.codeup.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

// A Java bean is class with a default constructor and it has getters and setters for all
// it attributes/properties/instance variables

// Both the ORM (Hibernate) and the view (Thymeleaf) will use the getters and setters

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String body;

    @Column(nullable = false)
    private String snippet;

    @OneToOne
    private User owner;

    @ManyToOne
    @JsonManagedReference
    private User user;

    public Post(String title, String body, String snippet, User owner) {
        this.title = title;
        this.body = body;
        this.snippet = snippet;
        this.owner = owner;
    }

    public Post() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
