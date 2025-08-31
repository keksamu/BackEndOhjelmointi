package com.example.viikko1johdanto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    @RequestMapping("/index")
    @ResponseBody 
    public String index() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String contact() {
        return "This is the contact page";
    }
    


    @RequestMapping("/hello")
    @ResponseBody
    public String returnString(@RequestParam(name = "name", required = false, defaultValue = "John") String name, 
        @RequestParam String location) {
        return "Welcome to the " + location + " " + name + "!";	
    }
    
}
