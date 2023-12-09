package com.vp.learning;

import org.springframework.stereotype.Component;

@Component
public class KhmerGreetingService implements GreetingService{
    @Override
    public void sayHello() {
        System.out.println("Sou Sdey");
    }
}
