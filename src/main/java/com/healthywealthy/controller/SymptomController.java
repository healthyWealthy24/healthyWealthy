package com.healthywealthy.controller;

import com.healthywealthy.service.SymptomService;
import com.healthywealthy.model.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SymptomController {

    @Autowired
    private SymptomService symptomService;

    @GetMapping("/symptoms")
    public String showSymptoms(@RequestParam("bodyPartId") int bodyPartId, Model model) {
        // SymptomService에서 getSymptomsByBodyPart 메서드를 호출하여 증상 목록을 가져옴
        List<String> symptoms = symptomService.getSymptomsByBodyPart(bodyPartId);
        model.addAttribute("symptoms", symptoms);
        return "index";
    }

    @GetMapping("/head")
    public String showHeadSymptoms(Model model) {
        // 데이터를 모델에 추가하거나 다른 로직을 처리할 수 있습니다.
        return "head"; // src/main/resources/templates/head.html로 이동
    }

    @PostMapping("/selectSymptom")
    public String selectSymptom(@RequestParam("symptomId") int symptomId, Model model) {
        model.addAttribute("symptomId", symptomId);
        return "redirect:/recommendations?symptomId=" + symptomId;
    }
}
