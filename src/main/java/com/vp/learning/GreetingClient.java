package com.vp.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingClient {

    @Autowired
    private GreetingService greetingService;



    public void greet(){
        this.greetingService.sayHello();
    }
}
