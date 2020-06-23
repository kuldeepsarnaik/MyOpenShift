package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users_database")
public class user {

    public int getId() {
        return id;
    }

    public user(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public user() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    
}
