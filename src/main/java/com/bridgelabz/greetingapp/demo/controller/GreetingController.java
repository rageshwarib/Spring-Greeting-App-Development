package com.bridgelabz.greetingapp.demo.controller;

import com.bridgelabz.greetingapp.demo.model.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @PostMapping("/addGreeting/{name}")
    public Greeting addGreeting(@PathVariable String name){
        return new Greeting(name);
    }

    @GetMapping("/getGreeting/{name}")
    public Greeting getGreeting(@PathVariable String name){
        return new Greeting(name);
    }

    @DeleteMapping("deleteGreeting/{name}")
    public String deleteGreeting(@PathVariable String name){
        return "Greeting Deleted";
    }
}
