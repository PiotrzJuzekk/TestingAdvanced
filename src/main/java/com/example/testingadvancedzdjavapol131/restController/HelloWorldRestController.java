package com.example.testingadvancedzdjavapol131.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldRestController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}
