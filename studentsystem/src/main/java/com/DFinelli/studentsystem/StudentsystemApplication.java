package com.DFinelli.studentsystem;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration
//@EntityScan(basePackages = {"com.entities.package"}) //your entities package goes here
//@EnableJpaRepositories(basePackages = {"com.repositories.package"})//your repository package goes here
public class StudentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}

}
