package org.example;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService os){
        this.orderService = os;
    }

    public boolean createOrder(Order or){
       return orderService.createOrder(or);
    }

}
