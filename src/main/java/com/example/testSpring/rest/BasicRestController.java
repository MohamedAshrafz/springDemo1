package com.example.testSpring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @Value("${creator.name}")
    private String name;

    @GetMapping("/")
    public String sayHello() {
//        return String.format("Hello %s!!", username != null ? username : "World");
        return "<h1>Does this really work ?? " + name + "!!</h1>";
    }

    @GetMapping("/fortune")
    public String myFortune() {
//        return String.format("Hello %s!!", username != null ? username : "World");
        return "Your fortune is not so great " + name + "!!</h1>";
    }
}
