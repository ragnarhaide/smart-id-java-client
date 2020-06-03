package ee.sk.smartid.exception;

/**
 * Exceptions that subclass this mark situations where something is wrong with
 * client-side integration or how Relying Party account has been configured by Smart-ID operator
 * or Smart-ID server is under maintenance.
 * With these types of errors there is not recommended to ask the user for immediate retry.
 */
public abstract class NotRetryableSmartIdException extends SmartIdException {
    public NotRetryableSmartIdException(String message) {
        super(message);
    }

    public NotRetryableSmartIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
