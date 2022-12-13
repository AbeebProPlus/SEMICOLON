package exceptions;

public class TextNotFoundException extends RuntimeException{
    public TextNotFoundException(String message){
        super(message);
    }
}
