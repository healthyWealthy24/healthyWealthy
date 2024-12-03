package com.healthywealthy.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisplayManager {

    @Autowired
    private DisplayFormatter displayFormatter;

    @Autowired
    private LayoutAdjuster layoutAdjuster;

    @Autowired
    private UserNotifier userNotifier;

    public void showResult(String rawRecommendations, String deviceType) {
        // 데이터를 포맷
        String formattedData = displayFormatter.formatRecommendations(rawRecommendations);
        // 장치에 맞게 레이아웃 조정
        String adjustedLayout = layoutAdjuster.adjustLayoutForDevice(formattedData, deviceType);
        // 결과 출력
        System.out.println(adjustedLayout);
        // 사용자에게 알림
        userNotifier.notifyUser("Displaying the result based on the device layout.");
    }
}
