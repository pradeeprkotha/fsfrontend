package com.auth.jwtwork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/h2")
    public String getAll(){
        String message = "Just secure message";
        return message;
    }
}
