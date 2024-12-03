package com.healthywealthy.util;

import org.springframework.stereotype.Component;

@Component
public class DisplayFormatter {

    public String formatRecommendations(String rawRecommendations) {
        // 추천 데이터를 적절히 포맷하는 로직 (예: JSON을 읽어서 HTML로 변환하거나, 텍스트로 포맷)
        return "Formatted Recommendations: " + rawRecommendations;
    }
}
