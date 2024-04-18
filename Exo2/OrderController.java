package org.example;

public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService os){
        this.orderService = os;
    }

    public void createOrder(Order or){
       orderService.createOrder(or);
    }

}
