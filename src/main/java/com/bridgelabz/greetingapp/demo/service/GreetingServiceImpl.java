package com.bridgelabz.greetingapp.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {
    @Override
    public String greetMessage() {
        return "Hello World";
    }
}
