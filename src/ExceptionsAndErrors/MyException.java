package ExceptionsAndErrors;

public class MyException extends Exception{
    private String fileName;
    public MyException(String message, String fileName) {
        super(message);
        this.fileName = fileName;
    }
}
