package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class OrderControllerTest {


    OrderService orderService = mock(OrderService.class);
    OrderDao orderDao = mock(OrderDao.class);

    OrderController orderController = new OrderController(orderService);
    Order order = new Order(1,"nana");

    @Test
    void createOrder() {
        orderController.createOrder(order);
        verify(orderService).createOrder(eq(order));
    }
}