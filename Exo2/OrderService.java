package org.example;

public class OrderService implements OrderDao {

    public void createOrder(Order or) {
        OrderDao.saveOrder(or) ;
    }
}
