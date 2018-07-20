package com.qburst.controller;

import com.qburst.model.generate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class maincontroller {

    @Value("${messages.hello}")
    private String data;


    @Autowired
    private cityservice cityService;

    @RequestMapping("/")
    public String greeting(Model model){
        model.addAttribute("cities",cityService.find());
        return "hello";
    }

}
