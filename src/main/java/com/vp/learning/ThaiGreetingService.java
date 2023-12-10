package com.vp.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ThaiGreetingService implements GreetingService{
    @Override
    public void sayHello() {
        System.out.println("Savady Krub");
    }
}
