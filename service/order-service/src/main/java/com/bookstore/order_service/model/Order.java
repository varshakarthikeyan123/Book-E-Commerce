package com.bookstore.order_service.model;

public class Order {

    private Long orderId;
    private Long bookId;
    private String bookTitle;
    private double price;

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Long getBookId() { return bookId; }
    public void setBookId(Long bookId) { this.bookId = bookId; }

    public String getBookTitle() { return bookTitle; }
    public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
