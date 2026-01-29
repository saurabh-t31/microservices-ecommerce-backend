package com.microservices.order_service.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.order_service.client.InventoryClient;
import com.microservices.order_service.model.Inventory;
import com.microservices.order_service.model.OrderEvent;
import com.microservices.order_service.producer.OrderProducer;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class Order_Controller {

    @Autowired
    private OrderProducer producer;
    
    @Autowired
    private InventoryClient inventoryClient;

    @GetMapping("/placeOrder")
    // @CircuitBreaker(name = "InventoryCB",fallbackMethod = "fallbackInventory")
    public String placeOrder() {

        OrderEvent orderEvent = new OrderEvent(
            UUID.randomUUID().toString(),
            "CREATED",
            "Order Created Successfully"
        );
        producer.sendOrderEvent(orderEvent);
        
        // List<Inventory> inventoryList = inventoryClient.getInventoryList();
        return "Order Placed Succesfully";
    }

    public String fallbackInventory(){
            return "Service Down";
    }
    



    
}
