package com.example.toyproject.rest.consuming;

import com.example.toyproject.domain.data.Greeting;
import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.example.toyproject.ToyprojectApplication.LOGGER;

@Service
public class GreetingTemplate {
    private RestTemplate template;
    private final String BASE_URL = "http://localhost:8080/greeting";
    private final String USER_PROPERTY = "?user=";

    public GreetingTemplate() {
        template = new RestTemplate();

    }

    public void greetDefault() {
        greet(null);
    }

    public void greetEmma() {
        greet("emma");
    }

    private void greet(@Nullable String user) {
        String requestUrl = BASE_URL;
        if (user != null) {
            requestUrl += USER_PROPERTY + user;
        }
        System.out.println("request_url: ".concat(requestUrl));
        ResponseEntity<Greeting> response = template.getForEntity(requestUrl, Greeting.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            LOGGER.info("request succesfullStatus OK");
            System.out.println(response);
        } else {
            LOGGER.warn("Response not successfull, Code:", response.getStatusCode());
        }
    }

}
