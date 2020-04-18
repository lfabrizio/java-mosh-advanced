package exceptions;

import java.awt.*;

public class AccountException extends Account {
    public AccountException(Exception cause){
        super(cause);
    }
}
