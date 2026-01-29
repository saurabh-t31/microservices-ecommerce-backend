package com.microservices.order_service.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.microservices.order_service.model.OrderEvent;

@Service
public class OrderProducer {

    @Autowired
    private KafkaTemplate<String , OrderEvent> kafkaTemplate;
    
    public void sendOrderEvent(OrderEvent orderEvent){
        System.out.println("📤 Publishing event: " + orderEvent);
        kafkaTemplate.send("order-events",orderEvent);
    }

    
}
