package com.infodart.iepfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IepfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IepfaApplication.class, args);
		 
		System.out.println("Tomcat Started");
		
		System.out.println("Try hitting the API through Postman");
	}

}

//http://localhost:8080/person