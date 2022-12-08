package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class Controller {


    @GetMapping("/get")
    public String index() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("https://catfact.ninja/fact", String.class);
        return result;
    }


    @PostMapping("/post")
    @ResponseBody
    public String index2() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("https://catfact.ninja/fact", String.class);
        return result;
    }

}