package com.healthywealthy.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomService {

    // 예시: bodyPartId에 맞는 증상 목록을 반환하는 로직
    public List<String> getSymptomsByBodyPart(int bodyPartId) {
        // 여기에 실제 데이터베이스 조회나 기타 로직을 추가합니다.
        // 예를 들어, 데이터베이스에서 증상 목록을 가져오는 코드가 들어갈 수 있습니다.

        // 예시 반환 값 (실제로는 데이터베이스에서 조회해야 함)
        if (bodyPartId == 1) {
            return List.of("Headache", "Dizziness", "Nausea");
        } else if (bodyPartId == 2) {
            return List.of("Cough", "Sore throat", "Fever");
        } else {
            return List.of("No symptoms found");
        }
    }
}
