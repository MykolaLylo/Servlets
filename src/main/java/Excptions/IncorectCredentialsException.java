package Excptions;

public class IncorectCredentialsException extends Exception{
    public IncorectCredentialsException() {
        super();
    }

    public IncorectCredentialsException(String message) {
        super(message);
    }

    public IncorectCredentialsException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorectCredentialsException(Throwable cause) {
        super(cause);
    }

    protected IncorectCredentialsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
