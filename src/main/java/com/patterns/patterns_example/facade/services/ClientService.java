package com.patterns.patterns_example.facade.services;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public boolean isClientValid(Long clientId) {
        // Simulate a check to see if the client is valid
        return clientId != null && clientId > 0;
    }

    public String getClientName(Long clientId) {
        // Simulate fetching the client's name
        return "Client Name for ID: " + clientId;
    }

}
