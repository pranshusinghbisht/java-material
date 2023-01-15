package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice //AOP Aspect oriented Programming
public class GlobalExceptionalHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> myExceptionHandler(ArithmeticException ae) {
        return new ResponseEntity<>(ae.getMessage(), HttpStatus.BAD_REQUEST);
    }


    //custom form exception -> response
    @ExceptionHandler(InvalidNumberException.class)
    public ResponseEntity<MyErrorDetails> myExceptionHandler2(InvalidNumberException ae, WebRequest req) {

        MyErrorDetails err = new MyErrorDetails();

        err.setTime(LocalDateTime.now());
        err.setMsg(ae.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> myExceptionHandler3(Exception ae) {
        return new ResponseEntity<>(ae.getMessage(), HttpStatus.BAD_REQUEST);

    }
}
