package com.example.springdemo.cicd.springbootcicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

    @RequestMapping("/")
    public String index(){
        return "Welcome to Spring Boot CI-CD Excercise";
    }
}
