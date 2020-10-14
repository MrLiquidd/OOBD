package Lab1;


import java.util.Date;
import java.util.List;

public class Order {

    private double orderPrice;
    private Date orderDate;
    private int clientID;
    private List<Order> orderList;

    public Order(double orderPrice, Date orderDate, int clientID, List<Flower> flowerList) {
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.clientID = clientID;
        this.orderList = orderList;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public List<Order> getOrederList() {
        return orderList;
    }

    public void setFlowerList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void showProductsList() {
        for (Order order: this.orderList) {
            System.out.println(order.toString());
        }
    }

    @Override
    public String toString() {
        return "Order: \n" +
                "orderPrice: " + this.orderPrice +
                "clientID: " + this.clientID +
                "orderDate: " + this.orderDate;
    }
}
