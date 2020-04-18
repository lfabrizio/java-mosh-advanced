package exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.AccessException;

// checked exception(done at compiler time)
public class ExceptionsDemo {
    public static void show() throws IOException {
        var account = new Account();
        account.withdraw(10);
        try {
            account.deposit(-1);
        } catch (AccessException e) {
            e.printStackTrace();
        }
    }
}
