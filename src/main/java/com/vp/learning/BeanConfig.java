package com.vp.learning;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(BeanConfig2.class)
@Configuration
@ComponentScan("com.vp.learning")
public class BeanConfig {

    @Bean
    public GreetingService getGreetingService(){

        return new KhmerGreetingService();
//        return new ThaiGreetingService();
    }

    @Bean(autowire = Autowire.BY_TYPE)
//    @Bean
    public GreetingClient greetingClient() {
        return new GreetingClient();
    }
}
