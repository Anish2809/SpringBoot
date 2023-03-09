package com.constructorinj.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.constructorinj.entity.Subject;
import com.constructorinj.entity.Trainer;
@Configuration
public class Config {
	//Spring @Bean Annotation is applied on a method to specify that it returns a bean to be managed by Spring context
	@Bean
	public Subject subject ()
	{
       return new Subject ("JAVA");
  
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer (subject());
  
    }
	
}


