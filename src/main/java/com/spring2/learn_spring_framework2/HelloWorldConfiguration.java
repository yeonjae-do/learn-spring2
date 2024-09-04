package com.spring2.learn_spring_framework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address){};
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
    public Person person(){
        return new Person("Ravi", 25, new Address("1555번길", "수원"));
    }

    @Bean
    public Person person2MethodCall (){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters (String name, int age, Address address2){
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("1555번길", "수원");
    }
}
