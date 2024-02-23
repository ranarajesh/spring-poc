package com.springpoc.learnspring.helloworldspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Record : Eliminate verbosity in creating Java Beans 
// public accessor methods, constructor, equals, hashcode, and toSTring are automatically created. 
// Released in JDK 16
/**
 * InnerHelloWorldConfiguration
 */
 record Person(String name, int age) {}
 record Address(String firstLine, String city){}
 record PersonAddress(String name, int age, Address address){}

@Configuration
public class HelloWorldConfiguration {
  // manage beans

  @Bean  // to make bean or produce bean 
  public String name(){
        return "RKR";
   }

  @Bean  
  public int age(){
        return 15;
   }

   @Bean
   public Person person(){
    return new Person("Ravi", 19);
   }

   @Bean
   public Person personToMethodCall(){
    return new Person(name(), age()); // Relationship between other beans
   }

   @Bean 
   public PersonAddress personAddress(){
    return new PersonAddress(name(), age(), new Address("Main Street", "Utrecht") );
   }

   @Bean
   public PersonAddress personToParameters(String name, int age, Address address){
     return new PersonAddress(name, age, address);
   }

   @Bean
   public PersonAddress personToParametersQualifier(String name, int age, @Qualifier("addressQualifier") Address address){
     return new PersonAddress(name, age, address);
   }

   //@Bean(name="yourCustomBeanName")
   @Bean(name = "address2")
   @Primary
   public Address address(){
    return new Address("Baker Street","London");
   }

   @Bean
   @Qualifier("addressQualifier")
   public Address address3(){
    return new Address("New Delhi","Delhi");
   }

}
