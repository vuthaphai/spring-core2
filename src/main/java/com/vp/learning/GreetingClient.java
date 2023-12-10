package com.vp.learning;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
//@Setter
public class GreetingClient {

    @Autowired
    @Qualifier("khmerGreetingService")
//    @Inject
    private GreetingService greetingService;
//    private GreetingService khmerGreetingService;
//    private GreetingService thaiGreetingService;

//    public void setGreetingService(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public void greet(){

        this.greetingService.sayHello();
//        this.khmerGreetingService.sayHello();
//        this.thaiGreetingService.sayHello();
    }
}
