package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// catching multiples
public class CatchingMultiple {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
           var value = reader.read();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("could not read data");
        }
    }
}
