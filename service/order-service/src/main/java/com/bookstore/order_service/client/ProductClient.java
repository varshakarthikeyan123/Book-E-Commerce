package com.bookstore.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "BOOK-SERVICE", path = "/api/products")
public interface ProductClient {

    @GetMapping("/{id}")
    String getProductById(@PathVariable Long id);
}