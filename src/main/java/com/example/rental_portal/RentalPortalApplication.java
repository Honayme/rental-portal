package com.example.rental_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.rental_portal.repository")
@EntityScan(basePackages = "com.example.rental_portal.entity")
public class RentalPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalPortalApplication.class, args);
	}
}
