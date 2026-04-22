package com.bookstore.order_service.controller;

import com.bookstore.order_service.client.ProductClient;
import com.bookstore.order_service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @PostMapping("/{bookId}")
    public Order createOrder(@PathVariable Long bookId) {

        // Call Product Service via Feign
        String book = productClient.getProductById(bookId);

        Order order = new Order();
        order.setOrderId(1L);
        order.setBookId(bookId);
        order.setBookTitle(book);
        order.setPrice(500);

        return order;
    }
}