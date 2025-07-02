package com.patterns.patterns_example.facade.services;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public boolean hasStock(Long productId, int quantity) {
        // Simulate a stock check
        return productId != null && productId > 0 && quantity > 0 && quantity <= 100; // Assume we have stock for quantities up to 100
    }
}
