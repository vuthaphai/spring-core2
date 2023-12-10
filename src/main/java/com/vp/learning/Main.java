package com.vp.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        greetingClient.greet();

//        BeanConfig2 beanConfig2 = context.getBean(BeanConfig2.class);

//        List<Integer> score = context.getBean(List.class);
//        System.out.println(score);


    }
}