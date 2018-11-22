package com.example.spring.fegin.feginclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name="service-hi")
public interface iHi {
    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
