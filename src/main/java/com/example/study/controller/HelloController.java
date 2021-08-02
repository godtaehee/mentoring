package com.example.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello spring and Complete CI/CD, Edit JSON, REAL";
    }

    @GetMapping("pr")
    public String prTest() {
        return "pr test";
    }

}
