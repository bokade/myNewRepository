package com.example.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyNewController {

    @GetMapping("/hii")
    public String getString(){
        return "Hello how are you ?";
    }
}
