package org.example;

public class Order {
    private long orderId;
    private String customerName;

    // Constructeur
    public Order(long orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // Getters et Setters
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

