package com.example.Login.service;

import com.example.Login.model.Notification;
import com.example.Login.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;
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

    public List<Notification> getAllNotifications() {
        List<Notification> notifications = notificationRepository.findAll();
        Collections.reverse(notifications); // Reversing the list to implement LIFO order
        return notifications;
    }
}
