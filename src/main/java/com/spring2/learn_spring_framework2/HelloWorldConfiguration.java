package com.spring2.learn_spring_framework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ranga";
    }
    @Bean
    public String age(){
        return "Ranga";
    }

}
