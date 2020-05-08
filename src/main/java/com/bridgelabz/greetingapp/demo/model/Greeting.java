package com.bridgelabz.greetingapp.demo.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Greeting {
    String message = "Hello %s";

    public Greeting(String name) {
        this.message = String.format(message, name);
    }

    public String getMessage() {
        return message;
    }
}
