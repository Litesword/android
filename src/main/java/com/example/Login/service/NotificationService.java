package com.example.Login.service;

import com.example.Login.model.Notification;
import com.example.Login.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }


    public Notification sendNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
}
