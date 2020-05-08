package com.bridgelabz.greetingapp.demo.service;

import com.bridgelabz.greetingapp.demo.model.Greeting;

public interface IGreetingService {
    public String greetMessage();
    public Greeting addGreeting(String name);
    public Greeting getGreeting(String name);
    public String deleteGreeting(String name);
}
