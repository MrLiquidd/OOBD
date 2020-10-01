package Lab2;


import Lab1.Flower;
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
        File file = new File("flower.json");

        if (file.exists()) {
            bankStr = new String(Files.readAllBytes(file.toPath()));
        }

        flower = new Gson().fromJson(bankStr, Flower.class);

        return flower;
    }

    public static List<Flower> loadFlowersList() throws IOException, JsonSyntaxException {
        String pStr = "";
        File file = new File("flowers.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File flowers.json not found!");
        }

        Gson gson = new Gson();

        Flower[] flws = gson.fromJson(pStr, Flower[].class);

        return Arrays.asList(flws);
    }
}