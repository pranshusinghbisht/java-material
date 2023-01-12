package com.practice.controller;

import com.practice.exception.InvalidIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello/{id}")
    public ResponseEntity<String> sayHello(@PathVariable("id") Integer id) throws InvalidIdException {
        if(id>10){
            return new ResponseEntity<String>("Welcome to Spring Boot", HttpStatus.ACCEPTED);
        }
        else{
            throw  new InvalidIdException("Invalid Id value");
        }

    }

/*    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> myExceptionalHandler(IllegalArgumentException ie){
        return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);
    }*/
}
