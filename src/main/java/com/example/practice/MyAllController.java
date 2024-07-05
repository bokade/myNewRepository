package com.example.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAllController {

    @GetMapping("/hi")
    public String getString(){
        return "Hello mhdghgr aj!";
    }
}
