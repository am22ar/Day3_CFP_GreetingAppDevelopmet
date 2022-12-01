package com.greet.greetings.service;

import com.greet.greetings.model.GreetModel;
import com.greet.greetings.repository.IrepoGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetService {
    @Autowired
    IrepoGreet irepoGreet;

    public String getSimpleGreet() {
        return "Hello World!!";
    }

    public String user(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public GreetModel saveUser(GreetModel greetModel) {
        return irepoGreet.save(greetModel);
    }
    public GreetModel getById(int id){
        GreetModel greetingModel =irepoGreet.findById(id).get();
        return greetingModel;
    }

    public List<GreetModel> getAll(){
        List<GreetModel> greetingModels=irepoGreet.findAll();
        return greetingModels;
    }
}