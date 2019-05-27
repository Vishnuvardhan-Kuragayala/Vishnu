package com.cg.aim.AimSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.aim.AimSpringBoot")
public class AimSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AimSpringBootApplication.class, args);
	System.out.println("Welcome to Spring boot");
	}

}
