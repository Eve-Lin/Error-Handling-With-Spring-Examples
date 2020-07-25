package com.example.errors.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController2 {

    @GetMapping("/crash-again")
    public ModelAndView crash(){
        throw new HelloException("I crashed!");
    }
}
