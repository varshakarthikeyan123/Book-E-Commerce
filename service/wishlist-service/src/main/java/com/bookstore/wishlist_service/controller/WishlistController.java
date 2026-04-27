package com.bookstore.wishlist_service.controller;


import com.bookstore.wishlist_service.client.ProductClient;
import com.bookstore.wishlist_service.model.WishlistItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    private List<WishlistItem> wishlist = new ArrayList<>();

    @Autowired
    private ProductClient productClient;

    @PostMapping("/{productId}")
    public String addToWishlist(@PathVariable Long productId) {

        String product = productClient.getProduct(productId);

        WishlistItem item = new WishlistItem();
        item.setProductId(productId);
        item.setProductName(product);

        wishlist.add(item);

        return "Added to wishlist";
    }

    @GetMapping
    public List<WishlistItem> getWishlist() {
        return wishlist;
    }

    @DeleteMapping("/{productId}")
    public String removeFromWishlist(@PathVariable Long productId) {
        wishlist.removeIf(item -> item.getProductId().equals(productId));
        return "Removed from wishlist";
    }
}
