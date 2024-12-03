package com.healthywealthy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NutrientRecommendation {
    @Id
    private int id;
    private String nutrient;
    private String description;
    private int symptomId;

    // Constructor
    public NutrientRecommendation() {}

    public NutrientRecommendation(int id, String nutrient, String description, int symptomId) {
        this.id = id;
        this.nutrient = nutrient;
        this.description = description;
        this.symptomId = symptomId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNutrient() {
        return nutrient;
    }

    public void setNutrient(String nutrient) {
        this.nutrient = nutrient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(int symptomId) {
        this.symptomId = symptomId;
    }
}
