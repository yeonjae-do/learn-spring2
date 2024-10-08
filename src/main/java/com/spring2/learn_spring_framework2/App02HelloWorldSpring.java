package com.spring2.learn_spring_framework2;

import com.spring2.learn_spring_framework2.game.GameRunner;
import com.spring2.learn_spring_framework2.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args){

        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2:Configure the things that we want Spring to manage
        //HelloWorldConfiguration - @Configuration
        //name -@Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean("address2"));

        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person5Qualifier"));

        //함수형 프로그래밍
        //System.out.println
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
