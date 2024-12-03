package com.healthywealthy.util;

import org.springframework.stereotype.Component;

@Component
public class LayoutAdjuster {

    public String adjustLayoutForDevice(String formattedRecommendations, String deviceType) {
        // 장치 타입에 맞게 레이아웃을 조정하는 로직 (예: 모바일에서는 한 줄로, 데스크탑에서는 표 형식으로 출력)
        if ("mobile".equalsIgnoreCase(deviceType)) {
            return "Mobile Layout: " + formattedRecommendations;
        } else {
            return "Desktop Layout: " + formattedRecommendations;
        }
    }
}
