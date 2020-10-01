package Lab2;

import Lab1.Flower;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<Flower> flowers = Load.loadFlowersList();

            flowers.forEach(System.out::println);

            Flower flw = FlowersService.findFlowersByName(flowers, "Тюльпан");

            if (flw != null) {
                flw.setName("");
                flw.setPrice(0);
            }

            Save.saveFlowerList(flowers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}