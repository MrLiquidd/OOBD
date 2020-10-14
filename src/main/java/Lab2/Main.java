package Lab2;

import Lab1.Flower;
import Lab1.Order;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    try {
            List<Order> orders = Load.loadOrderList();

            orders.forEach(System.out::println);

            Order ord = OrderService.findOrderByPrice(orders, 600);

            if (ord != null) {
                ord.setOrderPrice(60);
            }

            Save.saveOrderList(orders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}