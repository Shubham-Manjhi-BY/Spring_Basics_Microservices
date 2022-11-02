package com.movie.server.movie_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MovieServerApplication {

	public static void main(String[] args) {
		// Server: localhost:3000

		SpringApplication.run(MovieServerApplication.class, args);
	}

}
