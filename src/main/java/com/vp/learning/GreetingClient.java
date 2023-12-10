package com.vp.learning;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Setter
public class GreetingClient {

    @Autowired
    private GreetingService greetingService;



    public void greet(){
        this.greetingService.sayHello();
    }
}
