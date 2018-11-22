package com.example.spring.fegin.feginclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {

    @Autowired
    iHi ihi;

    @GetMapping(value = "/hi")
    public String home(@RequestParam String name) {
        return ihi.sayHi(name);
    }
}

