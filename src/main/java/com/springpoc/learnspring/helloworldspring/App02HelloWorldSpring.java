package com.springpoc.learnspring.helloworldspring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       // 1: Launch a  Spring context
       try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

           
           // 2: Configure the things that we want Spring to manage - @Configuration Class
           // HelloWorldConfiguration - @Configuration 
           // name - @Bean
           
           //3: Retrieving Beans managed by Spring 
           System.out.println(context.getBean("name"));
           System.out.println(context.getBean("age"));
           System.out.println(context.getBean("person"));
           System.out.println(context.getBean("personToMethodCall"));
           System.out.println(context.getBean("personAddress"));
           System.out.println(context.getBean("personToParameters"));
           System.out.println(context.getBean("personToParametersQualifier"));
           System.out.println(context.getBean("address2")); // Either use name of the bean or type to bean 
           System.out.println(context.getBean(Address.class)); // Type of the bean 
           
           // List all beans 
           // using functional programming 
           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // method reference
        }
           
    }
}
