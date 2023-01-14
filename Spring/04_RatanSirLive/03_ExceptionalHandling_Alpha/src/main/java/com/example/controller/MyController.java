package com.example.controller;

import com.example.exception.InvalidNumberException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //
public class MyController {


@GetMapping("/hello/{num}")
public ResponseEntity<String> sayHello(@PathVariable("num") Integer num){

    if(num == 100)
        throw new InvalidNumberException("Number shoube not be 100");


        int result = 100/num;
    return new ResponseEntity<>("Welcome"+result, HttpStatus.OK);
}

// using method

/*    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> myExceptionHandler(ArithmeticException ae){

    return new ResponseEntity<>(ae.getMessage(), HttpStatus.BAD_REQUEST);

    }*/


}
