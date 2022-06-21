package by.tms.authorization;

public class WrongLogin extends Exception {
    public WrongLogin(String message) {
        super(message);
    }
}
