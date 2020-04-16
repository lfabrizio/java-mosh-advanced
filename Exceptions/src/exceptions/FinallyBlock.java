package exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FinallyBlock {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            reader.close();

        } catch (IOException e) {
            System.out.println("could not read data");
        }
        finally {

        }
    }
}


