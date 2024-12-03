package com.healthywealthy.controller;

import com.healthywealthy.service.BodyPartService;
import com.healthywealthy.model.BodyPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BodyPartController {

    @Autowired
    private BodyPartService bodyPartService;

    @GetMapping("/")
    public String showBodyParts(Model model) {
        List<BodyPart> bodyParts = bodyPartService.getAllBodyParts();
        model.addAttribute("bodyParts", bodyParts);
        return "index";
    }

    @PostMapping("/selectBodyPart")
    public String selectBodyPart(@RequestParam("bodyPartId") int bodyPartId, Model model) {
        // bodyPartId에 해당하는 증상 리스트 가져오기
        List<String> symptoms = bodyPartService.getSymptomsByBodyPartId(bodyPartId);
        model.addAttribute("symptoms", symptoms);
        return "index";
    }
}
