package app;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1010, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);
        // Order{id='1010', moment=Tue May 06 22:13:12 GMT-03:00 2025, status=PROCESSING}

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

    }
}
