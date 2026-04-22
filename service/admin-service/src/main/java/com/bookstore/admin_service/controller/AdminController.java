package com.bookstore.admin_service.controller;

import com.bookstore.admin_service.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private ProductClient productClient;

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productClient.deleteProduct(id);
        return "Product deleted by admin";
    }
}