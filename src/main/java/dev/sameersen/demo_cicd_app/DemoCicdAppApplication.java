package dev.sameersen.demo_cicd_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCicdAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCicdAppApplication.class, args);
		System.out.println("Hello From CI-CD Demo APP");
	}

}
