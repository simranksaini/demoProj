package com.springboot.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class clientController {

    @Value("${config.server.key}")
    private String key1;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Cloud Demo Project";
    }

    @RequestMapping("/client")
    public String client() {
        return key1;
    }


}
