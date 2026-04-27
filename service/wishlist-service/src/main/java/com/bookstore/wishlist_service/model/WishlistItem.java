package com.bookstore.wishlist_service.model;

public class WishlistItem {

    private Long productId;
    private String productName;

    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
}