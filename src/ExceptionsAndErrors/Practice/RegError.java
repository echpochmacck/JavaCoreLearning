package ExceptionsAndErrors.Practice;

public class RegError extends RuntimeException {
    public RegError( String fieldName) {
        super("error in chars - " + fieldName);
    }
}
