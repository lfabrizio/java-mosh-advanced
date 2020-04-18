package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class TrywResources {
    public static void show() {

        try (
                var reader = new FileReader("file.txt")){
                var writer = reader.read();
            {
                var value = reader.read();
            }
        } catch (
                IOException e) {
            System.out.println("could not read data");
        }
    }
}