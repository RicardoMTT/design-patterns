package com.patterns.patterns_example.facade.controllers;


import com.patterns.patterns_example.facade.facadeimpl.OrderFacade;
import com.patterns.patterns_example.facade.model.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderFacade orderFacade;


    public OrderController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest request) {
        orderFacade.processOrder(
                request.getClientId(),
                request.getProductId(),
                request.getQuantity()
        );
        return "✅ Pedido procesado exitosamente.";
    }

}
