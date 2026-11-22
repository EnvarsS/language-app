package org.envycorp.userservice.exception;

public class NoSuchUserWithIdSpecifiedException extends RuntimeException {
    public NoSuchUserWithIdSpecifiedException(String message) {
        super(message);
    }
}
