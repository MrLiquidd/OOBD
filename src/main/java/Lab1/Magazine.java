package Lab1;

import java.util.List;

public class Magazine {

    private String name;
    public static List<Worker> workers;
    public static List<Client> clients;
    public static List<Order> orders;
    public static List<Flower> flowers;

    public Magazine(String name){
        this.name = name;
    }

    public List<Flower> getFlowers(){
        return flowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showFlowers(){
        for (Flower flower: this.flowers)
            System.out.println(flower.toString());
    }
}
