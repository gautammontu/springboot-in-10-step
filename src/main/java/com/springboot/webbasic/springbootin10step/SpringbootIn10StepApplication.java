package com.springboot.webbasic.springbootin10step;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepApplication {

	public static void main(String[] args) {
		ApplicationContext application=SpringApplication.run(SpringbootIn10StepApplication.class, args);
		
		
		for (String string : application.getBeanDefinitionNames()) {
			System.out.println(string);
		}
	}

}
