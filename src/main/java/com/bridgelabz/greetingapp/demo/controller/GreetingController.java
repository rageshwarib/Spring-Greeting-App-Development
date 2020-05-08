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
        return iGreetingService.addGreeting(name);
    }

    @GetMapping("/getGreeting/{name}")
    public Greeting getGreeting(@PathVariable String name){
        return iGreetingService.getGreeting(name);
    }

    @DeleteMapping("deleteGreeting/{name}")
    public String deleteGreeting(@PathVariable String name){
        return iGreetingService.deleteGreeting(name);
    }
    @GetMapping("/")
    public String hello(){
        return iGreetingService.greetMessage();
    }
}
