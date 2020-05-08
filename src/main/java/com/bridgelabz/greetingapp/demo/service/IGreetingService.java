package com.bridgelabz.greetingapp.demo.service;

import com.bridgelabz.greetingapp.demo.dto.GreetingDto;
import com.bridgelabz.greetingapp.demo.model.Greeting;

public interface IGreetingService {
    public String greetMessage();
    public Greeting addGreeting(String name);
    public Greeting getGreeting(String name);
    public String deleteGreeting(String name);

    public Greeting updateGreeting(String firstname, String lastName);
}
