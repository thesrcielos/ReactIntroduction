package org.eci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@RestController
public class WebSiteController {
    public static void main(String[] args) {
        SpringApplication.run(WebSiteController.class, args);
    }
    @GetMapping("/status")
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. " +
                LocalDate.now() + ", " +
                LocalTime.now() +
                ". " + "The server is Runnig!\"}";
    }
}