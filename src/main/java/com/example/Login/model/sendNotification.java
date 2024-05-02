package com.example.Login.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Notifications")
public class sendNotification {
    private String notificationTitle, notificationContent;

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }
}
