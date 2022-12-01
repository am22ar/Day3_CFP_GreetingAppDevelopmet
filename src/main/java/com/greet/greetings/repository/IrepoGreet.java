package com.greet.greetings.repository;

import com.greet.greetings.model.GreetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepoGreet extends JpaRepository<GreetModel,Integer> {

}
