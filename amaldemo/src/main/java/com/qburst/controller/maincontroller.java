package com.qburst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }

}
