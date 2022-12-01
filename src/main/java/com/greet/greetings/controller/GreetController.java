package com.greet.greetings.controller;

import com.greet.greetings.model.GreetModel;
import com.greet.greetings.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/start")
public class GreetController {
    @Autowired
    GreetService greetService;
    @GetMapping("/simplegreet")
    public String simplegreet(){
        return greetService.getSimpleGreet();
    }
    //displaying data in Request body
    @PostMapping
    public String getUsers(@RequestBody String firstName, String lastName) {
        return greetService.user(firstName,lastName);
    }
    //adding new user to database
    @PostMapping("/savedUser")
    public GreetModel savedUser(@RequestBody GreetModel greetingModel){
        return greetService.saveUser(greetingModel);
    }

}
