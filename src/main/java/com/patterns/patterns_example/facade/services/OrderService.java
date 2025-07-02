package com.patterns.patterns_example.facade.services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void createOrder(Long clientId, Long productId, int quantity) {
        System.out.println("📦 Pedido creado correctamente.");
    }

}
