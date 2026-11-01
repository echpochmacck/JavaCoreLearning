package ExceptionsAndErrors.Practice;

public class EmptyFields extends RuntimeException {
    public EmptyFields(String fieldName) {
        super("Field is empty - " + fieldName);
    }
}
