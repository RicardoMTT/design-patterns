package com.patterns.patterns_example.facade.services;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyClient(Long clientId) {
        System.out.println("✉️ Correo enviado al cliente " + clientId);
    }

}
