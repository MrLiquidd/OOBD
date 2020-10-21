package Lab3;

import Lab1.Flower;
import Lab1.Magazine;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {

        Magazine magazine = new Magazine();

        Flower flower1 = new Flower("Rose", 150, "Rose hip" );
        Flower flower2 = new Flower("Tulip",60 , "Vascular");
        Flower flower3 = new Flower("Orchid", 70, "Monocotyledonous");

        List<Flower> flowers = new ArrayList<>();
        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);

        magazine.setFlowers(flowers);

        XMLService.saveFlowerData(magazine);

        Magazine magazine1 = XMLService.loadMagazineFromXML();
        assert magazine1 != null;
        magazine1.showFlowers();

        System.out.println("\n********** Searching product by price **********\n");
        XMLService.searchByPrice(magazine1, 70);

        System.out.println("\n********** Sorting product by price **********\n");
        XMLService.sortByPrice(magazine1);
    }
}
