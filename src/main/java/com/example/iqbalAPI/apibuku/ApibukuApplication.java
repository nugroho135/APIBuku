package com.example.iqbalAPI.apibuku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApibukuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApibukuApplication.class, args);
	}

}
