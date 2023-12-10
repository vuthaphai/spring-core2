package com.vp.learning;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

//@Component
//@Setter
public class GreetingClient {

//    @Autowired
    @Inject
    private GreetingService greetingService;

//    public void setGreetingService(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public void greet(){
        this.greetingService.sayHello();
    }
}
