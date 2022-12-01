package com.greet.greetings.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public String getHello( String name){
        return "Hello "+name;
    }
    public String getSimpleGreet(){
        return "Hello World!!";
    }
}
