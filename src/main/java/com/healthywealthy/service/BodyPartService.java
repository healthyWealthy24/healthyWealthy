package com.healthywealthy.service;

import com.healthywealthy.model.BodyPart;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class BodyPartService {

    // 기존의 bodyPart 리스트 반환 메서드
    public List<BodyPart> getAllBodyParts() {
        // 예시: BodyPart 객체를 반환
        return Arrays.asList(
                new BodyPart(1, "Head"),
                new BodyPart(2, "Shoulder"),
                new BodyPart(3, "Chest")
        );
    }

    // bodyPartId에 해당하는 증상 리스트 반환 메서드
    public List<String> getSymptomsByBodyPartId(int bodyPartId) {
        // 예시: bodyPartId에 따른 증상 목록 반환
        switch (bodyPartId) {
            case 1: return Arrays.asList("Headache", "Dizziness");
            case 2: return Arrays.asList("Shoulder pain", "Stiffness");
            case 3: return Arrays.asList("Chest pain", "Shortness of breath");
            default: return Arrays.asList("No symptoms found");
        }
    }
}
