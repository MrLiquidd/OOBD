package Lab2;


import Lab1.Flower;
import Lab1.Order;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Load {

    public static Flower load() throws IOException {
        Flower flower = null;
        String bankStr = "";
        File file = new File("orders.json");

        if (file.exists()) {
            bankStr = new String(Files.readAllBytes(file.toPath()));
        }

        flower = new Gson().fromJson(bankStr, Flower.class);

        return flower;
    }

    public static List<Order> loadOrderList() throws IOException, JsonSyntaxException {
        String pStr = "";
        File file = new File("orders.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File orders.json not found!");
        }

        Gson gson = new Gson();

        Order[] ords = gson.fromJson(pStr, Order[].class);

        return Arrays.asList(ords);
    }
}