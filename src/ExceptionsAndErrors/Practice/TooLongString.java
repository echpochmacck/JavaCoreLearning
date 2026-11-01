package ExceptionsAndErrors.Practice;

public class TooLongString extends RuntimeException {
    public TooLongString(String fieldName) {
        super("Field is too long - " + fieldName);
    }
}
