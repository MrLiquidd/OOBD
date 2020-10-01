package Lab2;

import Lab1.Flower;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class Save {

    public static void saveFlowerList(List<Flower> persons) throws IOException {

        if (persons != null && persons.size() > 0) {
            Gson gson = new Gson();

            String personsAsJson = gson.toJson(persons);

            System.out.println(personsAsJson);

            try (OutputStream os = new FileOutputStream(new File("persons.json"))) {
                os.write(personsAsJson.getBytes("UTF-8"));
                os.flush();
            }

        }
    }
}