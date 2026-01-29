package com.microservice.payment_service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventConsumer {

    @KafkaListener(
        topics = "order-events",
        groupId = "payment-group"
    )
    public void consumeOrderEvent(OrderEvent event) {

        System.out.println("Received Order Event in Payment Service");
        System.out.println("Processing payment for Order ID: " + event.getOrderId());

        // Simulate payment processing
        System.out.println("Payment successful for Order ID: " + event.getOrderId());
    }
}
