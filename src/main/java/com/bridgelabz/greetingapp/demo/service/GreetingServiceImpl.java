package com.bridgelabz.greetingapp.demo.service;

import com.bridgelabz.greetingapp.demo.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {
    @Override
    public String greetMessage() {
        return "Hello World";
    }

    @Override
    public Greeting addGreeting(String name) {
        return new Greeting(name);
    }

    @Override
    public Greeting getGreeting(String name) {
        return new Greeting(name);
    }

    @Override
    public String deleteGreeting(String name) {
        return "Greeting Deleted";
    }
}
