package pl.medapp.domain.exceptions;

public class ProcessingException extends RuntimeException {

    public ProcessingException(String message) {
        super(message);
    }
}
