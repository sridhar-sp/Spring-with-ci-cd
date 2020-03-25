package com.example.springdemo.cicd.springbootcicd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RestMainControllerTest {

    @Autowired
    RestMainController restMainController;

    @Test
    void testIndex() {
        assertEquals("Welcome to Project",restMainController.index());
    }
}