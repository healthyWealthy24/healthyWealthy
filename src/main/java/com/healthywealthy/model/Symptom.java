package com.healthywealthy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Symptom {
    @Id
    private int id;
    private String name;

    @ManyToOne
    private BodyPart bodyPart;

    // Constructor
    public Symptom() {}

    public Symptom(int id, String name, BodyPart bodyPart) {
        this.id = id;
        this.name = name;
        this.bodyPart = bodyPart;
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

    public BodyPart getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(BodyPart bodyPart) {
        this.bodyPart = bodyPart;
    }
}
