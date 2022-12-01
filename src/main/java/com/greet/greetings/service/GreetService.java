package com.greet.greetings.service;

import com.greet.greetings.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public String getHello( String name){
        return "Hello "+name;
    }
    public String getSimpleGreet(){
        return "Hello World!!";
    }
    public String getUserGreet(UserModel userModel){
        return "Hello "+userModel.getFirstName()+" "+userModel.getLastName();
    }
}
