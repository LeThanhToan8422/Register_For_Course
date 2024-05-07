package com.iuh.sa_final_project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.iuh.sa_final_project.models.User;
import com.iuh.sa_final_project.repositories.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			userRepository.save(new User("admin", "admin"));
		};
	}

}
