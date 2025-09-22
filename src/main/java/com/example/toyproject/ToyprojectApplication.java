package com.example.toyproject;

import com.example.toyproject.rest.consuming.GreetingTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToyprojectApplication {
    public static Logger LOGGER = LoggerFactory.getLogger(ToyprojectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ToyprojectApplication.class, args);
        GreetingTemplate template = new GreetingTemplate();
        template.greetDefault();
        template.greetEmma();
        template.greetEmma();
        template.greetEmma();
    }
}
