package com.example.errors.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class StudentHandler {

//    @ExceptionHandler({StudentNotFoundException.class})
//    public ResponseEntity<Error> handleStudentException() {
//       Error error = new Error();
//       error.setErrorName("Error :o");
//       error.setErrorDescription("Oooops, something bad happened!");
//        return ResponseEntity.ok(error);
//    }
}
