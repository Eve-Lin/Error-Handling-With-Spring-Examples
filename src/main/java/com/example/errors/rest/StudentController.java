package com.example.errors.rest;

import com.example.errors.mvc.HelloException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
//        throw new ArrayIndexOutOfBoundsException("Oooops, we've got a new exception ");
        throw new StudentNotFoundException("The student could not be found...Did you check his/her calendar? Maybe he/she is on vacation. Just saying...");
    }

//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler({StudentNotFoundException.class})
//    public ResponseEntity<Student> handleStudentException() {
//        Student student = new Student();
//        student.setName("default");
//        student.setAge(34);
//        return ResponseEntity.ok(student);
//    }
}
