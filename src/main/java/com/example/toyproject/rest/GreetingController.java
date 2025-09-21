package com.example.toyproject.rest;

import com.example.toyproject.domain.data.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//marks class to offer interfaces/mappings
@RestController
public class GreetingController {
    //static= bound              //%s gets replaced by passed variable
    private static final String responseTemplate = "Hello %s";
    //Atomic is thread safe
    private static final AtomicLong counter = new AtomicLong();

    //Mapping tells on what path/method resource is available (e.g. localhost:8080/greeting)
    @GetMapping("/greeting")
    //url parameter is accepted e.g. /greetings?user= if no Param is provived defaultValue is used
    public Greeting greeting(@RequestParam(defaultValue = "Bob") String user) {

        return new Greeting(
                counter.incrementAndGet(),
                String.format(responseTemplate, user));
    }
}