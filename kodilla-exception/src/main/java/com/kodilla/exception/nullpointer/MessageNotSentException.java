package com.kodilla.exception.nullpointer;

import java.util.concurrent.Executor;

public class MessageNotSentException extends Exception {
    public MessageNotSentException(final String message) {
        super(message);
    }
}
