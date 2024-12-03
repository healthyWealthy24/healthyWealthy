package com.healthywealthy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BodyPart {
    @Id
    private int id;
    private String name;

    // Constructor
    public BodyPart() {}

    public BodyPart(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
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
}