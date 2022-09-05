package com.ll.exam.app10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class App10Application {

	public static void main(String[] args) {
		SpringApplication.run(App10Application.class, args);
	}

}
