package com.vp.learning;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class BeanConfig2 {

    @Bean
    List<Integer> score() {
        return List.of(50,79,80,95);
    }
}
