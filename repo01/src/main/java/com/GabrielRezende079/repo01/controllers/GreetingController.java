package com.GabrielRezende079.repo01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.GabrielRezende079.repo01.model.Greeting;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    
    // http://localhost:8080/greeting?name=gabriel

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/greeting")
    public Greeting greeting(
        @RequestParam(value = "name",defaultValue = "World") 
        String name) { 

        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    
    }

}