package com.trmgapp.model;

import java.time.LocalDate;

public class Trainee {

    private int id;
    private String name;
    private String email;

    // generate getters setters and constructor
    // generate toString method

    public Trainee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Trainee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
