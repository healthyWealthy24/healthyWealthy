package com.healthywealthy.repository;

import com.healthywealthy.model.NutrientRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NutrientRecommendationRepository extends JpaRepository<NutrientRecommendation, Integer> {
    List<NutrientRecommendation> findBySymptomId(int symptomId);
}
