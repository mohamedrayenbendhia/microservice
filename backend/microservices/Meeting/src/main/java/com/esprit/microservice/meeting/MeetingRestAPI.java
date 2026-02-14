package com.esprit.microservice.meeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic3/meetings")
public class MeetingRestAPI {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello microservice 3";
    }
}
