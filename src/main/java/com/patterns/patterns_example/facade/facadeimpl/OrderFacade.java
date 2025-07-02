package com.patterns.patterns_example.facade.facadeimpl;

import com.patterns.patterns_example.facade.services.ClientService;
import com.patterns.patterns_example.facade.services.InventoryService;
import com.patterns.patterns_example.facade.services.NotificationService;
import com.patterns.patterns_example.facade.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component

public class OrderFacade {

    private final ClientService clientService;
    private final InventoryService inventoryService;
    private final OrderService orderService;
    private final NotificationService notificationService;


    public OrderFacade(ClientService clientService, InventoryService inventoryService, OrderService orderService, NotificationService notificationService) {
        this.clientService = clientService;
        this.inventoryService = inventoryService;
        this.orderService = orderService;
        this.notificationService = notificationService;
    }

    public void processOrder(Long clientId, Long productId, int quantity) {
        if (!clientService.isClientValid(clientId)) {
            throw new IllegalArgumentException("Cliente inválido");
        }

        if (!inventoryService.hasStock(productId, quantity)) {
            throw new IllegalArgumentException("Stock insuficiente");
        }

        orderService.createOrder(clientId, productId, quantity);
        notificationService.notifyClient(clientId);
    }



}
