package com.example.toyproject.rest;

import com.example.toyproject.domain.data.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//marks class to offer interfaces/mappings
@RestController
public class GreetingController {

    //Mapping tells on what path/method resource is available (e.g. localhost:8080/greeting)
    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(1, "2");
    }
}
