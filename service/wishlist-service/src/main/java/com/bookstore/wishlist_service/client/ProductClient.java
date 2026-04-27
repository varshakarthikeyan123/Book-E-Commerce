package com.bookstore.wishlist_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "BOOK-SERVICE")
public interface ProductClient {

    @GetMapping("/api/products/{id}")
    String getProduct(@PathVariable Long id);
}
