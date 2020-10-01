package Lab2;

import Lab1.Flower;

import java.util.List;

public class FlowersService {

    /**
     * Поиск по имени
     */
    public static Flower findFlowersByName(List<Flower> flowers, String searchName) {
        Flower result = null;

        for (Flower flower : flowers) {
            if (flower.getName().equals(searchName)) {
                result = flower;
            }
        }

        return result;
    }

}
