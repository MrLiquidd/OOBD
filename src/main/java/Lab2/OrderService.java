package Lab2;

import Lab1.Flower;
import Lab1.Order;

import java.util.List;

public class OrderService {

    public static Order findOrderByPrice(List<Order> orders, double searchPrice) {
        Order result = null;

        for (Order order : orders) {
            if (order.getOrderPrice() == searchPrice) {
                result = order;
            }
        }

        return result;
    }
}
