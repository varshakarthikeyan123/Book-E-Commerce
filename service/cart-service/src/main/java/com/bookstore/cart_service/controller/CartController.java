package com.bookstore.cart_service.controller;

import com.bookstore.cart_service.client.ProductClient;
import com.bookstore.cart_service.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private List<CartItem> cart = new ArrayList<>();

    @Autowired
    private ProductClient productClient;

    @PostMapping("/{productId}")
    public String addToCart(@PathVariable Long productId) {

        String product = productClient.getProduct(productId);

        CartItem item = new CartItem();
        item.setProductId(productId);
        item.setProductName(product);
        item.setPrice(500);

        cart.add(item);

        return "Added to cart";
    }

    @GetMapping
    public List<CartItem> getCart() {
        return cart;
    }
}