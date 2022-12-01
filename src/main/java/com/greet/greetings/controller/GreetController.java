package com.greet.greetings.controller;

import com.greet.greetings.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/start")
public class GreetController {
    @Autowired
    GreetService greetService;
    @GetMapping("/hello")
    public String get(@RequestBody String name){
        return greetService.getHello(name);
    }
    @GetMapping("/simplegreet")
    public String simplegreet(){
        return greetService.getSimpleGreet();
    }

}
