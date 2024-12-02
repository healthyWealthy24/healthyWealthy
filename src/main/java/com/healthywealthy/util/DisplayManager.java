package com.healthywealthy.util;

import org.springframework.stereotype.Component;

@Component
public class DisplayManager {
    public void showResult(String result) {
        System.out.println("Result: " + result);
    }
}

@Component
public class UserNotifier {
    public void notifyUser(String message) {
        System.out.println("Notification: " + message);
    }
}
