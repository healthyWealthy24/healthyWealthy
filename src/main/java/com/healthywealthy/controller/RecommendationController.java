package com.healthywealthy.controller;

import com.healthywealthy.service.RecommendationService;
import com.healthywealthy.model.NutrientRecommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/recommendations")
    public String showRecommendations(@RequestParam("symptomId") int symptomId, Model model) {
        List<NutrientRecommendation> recommendations = recommendationService.getRecommendationsBySymptom(symptomId);
        model.addAttribute("recommendations", recommendations);
        return "recommendations";
    }
}
