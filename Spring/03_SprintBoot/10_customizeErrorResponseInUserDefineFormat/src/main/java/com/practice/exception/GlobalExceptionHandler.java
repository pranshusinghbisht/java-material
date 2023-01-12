package com.practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    // handle specific type of exception
    //this class is required because if there are lot many handlers then we can use this as global

    @ExceptionHandler(InvalidIdException.class)
//    public ResponseEntity<String> myExceptionalHandler(IllegalArgumentException ie){
        public ResponseEntity<MyErrorDetails> myExceptionalHandler(IllegalArgumentException ie, WebRequest req){
        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
    }


    //Global
    // this is for any other type of exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> myExceptionalHandler2(Exception ie, WebRequest req){

        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
    }
}
