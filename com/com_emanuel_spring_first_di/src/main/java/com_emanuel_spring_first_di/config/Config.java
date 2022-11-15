package com_emanuel_spring_first_di.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import java.util.Date;

@Configuration
@ComponentScan(basePackages = { "com_emanuel_spring_first_di" })
public class Config {

   @Bean
    public Long getId() {
       return Long.valueOf(0);
   }

   @Bean
   @Qualifier("summary")
    public String getSummary() {
       return "Spring DI";
   }

   @Bean
   @Qualifier("description")
   public String getDescription() {
       return "Dependency injection in Spring is a powerful feature for inversion of control.";
   }

   @Bean
    public Boolean isDone() {
       return Boolean.FALSE;
   }

   @Bean
    public  Date getDueDate() {
        return new Date();
   }
}
