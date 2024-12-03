package com.healthywealthy.service;

import com.healthywealthy.model.NutrientRecommendation;
import com.healthywealthy.repository.NutrientRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    private NutrientRecommendationRepository nutrientRecommendationRepository;

    public List<NutrientRecommendation> getRecommendationsBySymptom(int symptomId) {
        return nutrientRecommendationRepository.findBySymptomId(symptomId);
    }
}
