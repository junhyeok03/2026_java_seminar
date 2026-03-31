package ch11.sec06;

public class InsufficientExeption extends Exception {
    public InsufficientExeption() {

    }

    public InsufficientExeption(String message) {
        super(message);
    }
}
