package com.example.springdemo.cicd.springbootcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

    @GetMapping("/")
    public String index(){
        return "Welcome to Spring Boot CI-CD Excercise";
    }
}
