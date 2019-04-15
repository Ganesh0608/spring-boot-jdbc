package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.example.*")
@ComponentScan("com.example.*")
@EnableJpaRepositories("com.example.*")
@SpringBootApplication

public class Acces1Application {

	public static void main(String[] args) {
		SpringApplication.run(Acces1Application.class, args);
	}

}
