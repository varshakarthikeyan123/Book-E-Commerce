package com.bookstore.admin_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "BOOK-SERVICE")
public interface ProductClient {

    @DeleteMapping("/api/products/{id}")
    void deleteProduct(@PathVariable Long id);
}
