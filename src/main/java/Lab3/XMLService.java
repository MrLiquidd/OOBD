package Lab3;

import Lab1.Flower;
import Lab1.Magazine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;

public class XMLService {

    public static void saveFlowerData(Magazine magazine) {

        try {
            StringWriter writer = new StringWriter();

            //создание объекта Marshaller, который выполняет сериализацию
            JAXBContext context = JAXBContext.newInstance(Magazine.class, Flower.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // сама сериализация
            marshaller.marshal(magazine, writer);

            //преобразовываем в строку все записанное в StringWriter
            String result = writer.toString();

            try (OutputStream os = new FileOutputStream(new File("magazine.xml"))) {
                os.write(result.getBytes(StandardCharsets.UTF_8));
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Magazine loadMagazineFromXML() {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Magazine.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Magazine) un.unmarshal(new File("magazine.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void searchByPrice(Magazine magazine, double price) {
        for (Flower flower: magazine.getFlowers()) {
            if (flower.getPrice() == price)
                System.out.println(flower.toString());
        }
    }

    public static void sortByPrice(Magazine magazine) {
        magazine.getFlowers().sort(new Comparator<Flower>() {

            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.compareTo(o2);
            }
        });


        magazine.getFlowers().forEach(System.out::println);
    }
}