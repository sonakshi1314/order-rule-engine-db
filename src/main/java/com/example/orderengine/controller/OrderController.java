package com.example.orderengine.controller;

import com.example.orderengine.model.Order;
import com.example.orderengine.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @Operation(summary = "Route an order based on dynamic rules")
    @PostMapping
    public ResponseEntity<String> route(@RequestBody Order order) {
        String partner = service.processOrder(order);
        return ResponseEntity.ok("Assigned Partner: " + partner);
    }
}
