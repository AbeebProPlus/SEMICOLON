package CreditCardValidation;

public class InvalidCardNumberException extends RuntimeException{
    public InvalidCardNumberException(String message){
        super(message);
    }
}
