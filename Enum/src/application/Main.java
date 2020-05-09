package application;

import entities.e.Order;
import entities.enums.OrderStatus;
import java.util.Date;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
        OrderStatus os1 = OrderStatus.SHIPPED;
        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");

        order.setStatus(os1);
        System.out.printf("\n%s\n", order);
    }

}
