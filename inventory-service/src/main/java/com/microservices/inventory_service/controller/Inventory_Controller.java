package com.microservices.inventory_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.inventory_service.model.Inventory;


@RestController
public class Inventory_Controller {

    @GetMapping("/inventory")
    public List<Inventory> getAllInventory(){
        return List.of(
            new Inventory(1L, "Laptop", 10),
            new Inventory(2L, "Mobile", 5)
        );
    }

}
