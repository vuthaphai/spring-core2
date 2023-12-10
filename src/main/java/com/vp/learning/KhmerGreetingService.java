package com.vp.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class KhmerGreetingService implements GreetingService{
    @Override
    public void sayHello() {
        System.out.println("Sou Sdey");
    }
}
