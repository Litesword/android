package com.example.Login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Login.model.Notification;


public interface NotificationRepository extends MongoRepository<Notification, String> {
}
