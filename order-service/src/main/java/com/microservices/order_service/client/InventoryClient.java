package com.microservices.order_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservices.order_service.model.Inventory;

@FeignClient(name = "inventory-service")
public interface InventoryClient {
    
        @GetMapping("/inventory")
        List<Inventory> getInventoryList();

}
