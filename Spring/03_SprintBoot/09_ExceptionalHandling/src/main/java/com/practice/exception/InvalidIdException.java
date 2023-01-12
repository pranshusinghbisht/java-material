package com.practice.exception;

public class InvalidIdException extends Exception{
    public InvalidIdException() {
    }

    public InvalidIdException(String message) {
        super(message);
    }
}
