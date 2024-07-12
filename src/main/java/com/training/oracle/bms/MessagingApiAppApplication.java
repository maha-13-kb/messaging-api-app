package com.training.oracle.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MessagingApiAppApplication {

	public void printGreetings() {
		System.out.println("Hi Oracle");
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println("JI");
	}
	

}
