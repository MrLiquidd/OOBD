package Lab1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="magazine")
public class Magazine {

    private String name;
    public static List<Worker> workers;
    public static List<Client> clients;
    public static List<Order> orders;
    public static List<Flower> flowers;

    public Magazine(String name){
        this.name = name;
    }

    public Magazine() {}

    public List<Flower> getFlowers(){
        return flowers;
    }

    @XmlElementWrapper(name="flowers", nillable = true)
    @XmlElement(name = "flower")
    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
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
