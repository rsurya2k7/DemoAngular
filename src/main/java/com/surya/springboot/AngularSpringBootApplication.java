package com.surya.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.surya")
@EnableJpaRepositories("com.surya.springboot.repo")
@EntityScan(basePackages = "com.surya.springboot.domain")
public class AngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBootApplication.class, args);
	}
}
