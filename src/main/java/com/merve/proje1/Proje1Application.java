package com.merve.proje1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.merve.proje1.services"})
@ComponentScan(basePackages = {"com.merve.proje1.pojo"})

public class Proje1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proje1Application.class, args);
	}




}
