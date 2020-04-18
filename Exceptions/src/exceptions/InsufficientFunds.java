package exceptions;
// checked vs unchecked
public class InsufficientFunds extends Exception {
    public InsufficientFunds() {
        super("Insufficient funds in your account");
    }
    public InsufficientFunds(String message){
        super(message);
    }
}
