package exceptions;
//catching exceptions
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchingExceptions {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("File Opened");
    }
}
