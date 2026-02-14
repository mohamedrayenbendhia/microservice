package com.esprit.microservice.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic2/jobs")
public class JobRestAPI {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello microservice 2";
    }
}
