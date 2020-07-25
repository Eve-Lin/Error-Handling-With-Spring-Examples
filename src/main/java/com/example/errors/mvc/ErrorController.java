package com.example.errors.mvc;

import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {

    @GetMapping("/crash")
    public ModelAndView crash(){
        throw new HelloException("I crashed!");
    }


    @GetMapping("/crash-two")
    public ModelAndView crashTwo(){
        throw new RuntimeException("I second crash!");
    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({HelloException.class})
//    public ModelAndView handleHelloException(HelloException ex){
//        ModelAndView modelAndView = new ModelAndView("errorhandler");
//        modelAndView.addObject("message", ex.getMessage());
//        return modelAndView;
//    }
}
