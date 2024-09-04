package com.spring2.learn_spring_framework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){};
record Address (String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ranga";
    }
    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(String name, int age){
        return new Person("Ravi", 25);
    }

    @Bean
    public Address address(String firstLine, String city){
        return new Address("1555번길", "수원");
    }
}
