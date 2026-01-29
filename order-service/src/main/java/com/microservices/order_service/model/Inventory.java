package com.microservices.order_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    private Long id;
    private String productName;
    private Integer quantity;

    // Constructors, Getters, Setters
}

