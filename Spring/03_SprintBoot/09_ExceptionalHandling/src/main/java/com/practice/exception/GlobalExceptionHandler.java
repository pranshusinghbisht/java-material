package com.practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // handle specific type of exception
    //this class is required because if there are lot many handlers then we can use this as global

    @ExceptionHandler(InvalidIdException.class)
    public ResponseEntity<String> myExceptionalHandler(IllegalArgumentException ie){
        return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);
    }


    //Global
    // this is for any other type of exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> myExceptionalHandler2(Exception ie){
        return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);
    }


}
