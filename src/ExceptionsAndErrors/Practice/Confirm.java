package ExceptionsAndErrors.Practice;

public class Confirm extends RuntimeException {
    public Confirm() {
        super("password confirm doesn't match to passsword");
    }
}
