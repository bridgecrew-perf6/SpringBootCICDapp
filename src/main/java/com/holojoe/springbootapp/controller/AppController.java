package com.holojoe.springbootapp.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World from Spring Boot";
    }

    @GetMapping("/what-is-the-time")
    public String time() {
        return new Date().toString();
    }
    
}
