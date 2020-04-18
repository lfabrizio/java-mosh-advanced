package exceptions;

import javax.print.DocFlavor;
import java.io.IOException;
import java.rmi.AccessException;

public class Account {
    private float balance;
    public void deposit(float value) throws IOException, InsufficientFunds {
        if (value < 0) {
            throw new IOException();
        }
        public void withdraw(float value) {
        if (value > balance)
            throw new AccessException((new InsufficientFunds());
        }
    }
}
