package com.everymoment.digitalwalking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DigitalwalkingApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(DigitalwalkingApplication.class, args);
	}

}
