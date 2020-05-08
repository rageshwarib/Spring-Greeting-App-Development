package com.bridgelabz.greetingapp.demo.controller;

import com.bridgelabz.greetingapp.demo.model.Greeting;
import com.bridgelabz.greetingapp.demo.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;
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
    @GetMapping("/")
    public String hello(){
        return iGreetingService.greetMessage();
    }
}
