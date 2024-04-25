package org.example;

public class OrderService {
    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    public boolean createOrder(Order or) {
        return orderDao.saveOrder(or) ;
    }
}
