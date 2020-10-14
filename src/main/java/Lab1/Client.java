package Lab1;

import java.util.List;

public class Client extends Person {
    private Flower loveflower;

    private List<Order> orderList;

    public Client(String name, String surname, String email, String password, Flower loveflower) {
        super(name, surname, email, password);
        this.loveflower = loveflower;
    }

    public Flower getLoveflower() {
        return loveflower;
    }

    public void setLoveflower(Flower loveflower) {
        this.loveflower = loveflower;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void showOrderList() {
        for (Order order: this.orderList) {
            System.out.println(order.toString());
        }
    }
}

