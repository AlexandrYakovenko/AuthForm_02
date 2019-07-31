package model.exceptions;

public class NicknameException extends Exception {

    public NicknameException() {
    }

    public NicknameException(String message) {
        super(message);
    }

    public NicknameException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String toString() {
        return "NicknameException{}";
    }
}
