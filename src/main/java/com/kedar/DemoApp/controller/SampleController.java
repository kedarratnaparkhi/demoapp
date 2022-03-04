package com.kedar.DemoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class SampleController {


    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello World";
    }
}
