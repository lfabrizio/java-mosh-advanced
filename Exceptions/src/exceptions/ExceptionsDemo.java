package exceptions;

import java.io.FileReader;
import java.io.IOException;

// checked exception(done at compiler time)
public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
