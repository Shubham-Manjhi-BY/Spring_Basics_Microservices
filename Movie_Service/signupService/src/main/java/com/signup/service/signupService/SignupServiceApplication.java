package com.signup.service.signupService;

import com.signup.service.signupService.model.User;
import com.signup.service.signupService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class SignupServiceApplication implements CommandLineRunner {

	private final UserRepository repository;

	public SignupServiceApplication(UserRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SignupServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//Movie App
		//
		//
		//=> Movie Server => Eureka Server
		//
		//
		//// Eureka Clients
		//
		//=> Authentication Service => Signup, Login  => h2 Database => cloud.properties
		//
		//=> Movie Service =>  Movie Crud => Add, Finding Movies => MongoDB  => cloud.properties

		// H2 Console: localhost:8080/h2-console

		// users Table: localhost:8080/users
		Stream.of("Manish","Bob","Carol").forEach((user) -> repository.save(new User(user.length(),user)));
		repository.findAll().forEach(System.out::println);
	}
}
