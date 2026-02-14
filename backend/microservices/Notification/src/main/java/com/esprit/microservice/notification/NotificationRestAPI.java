package com.esprit.microservice.notification;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic5/notifications")
public class NotificationRestAPI {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello microservice 5";
    }
}
