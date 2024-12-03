package com.healthywealthy.util;

import org.springframework.stereotype.Component;

@Component
public class UserNotifier {

    public void notifyUser(String message) {
        System.out.println("Notification: " + message);
    }
}
