package com.example.exception;

public class InvalidNumberException extends  RuntimeException{
    public InvalidNumberException() {
    }

    public InvalidNumberException(String message) {
        super(message);
    }
}


// for unchecked we extend with RuntimeException otherwise Exception
