package com.ninabornemann.springboottestproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello World! :)";
    }

    @GetMapping("/whatsup")
    public String whatsup() {
        return "Whats up?";
    }

    @GetMapping("/{name}")
    public String helloSomeone(@PathVariable String name) {
        return "Hello " + name;
    }
}
