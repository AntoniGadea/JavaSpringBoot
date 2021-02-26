package edu.alumno.toni.dwesUd3WebAppSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"edu.alumno.toni"})
public class DwesUd3WebAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DwesUd3WebAppSpringBootApplication.class, args);
	}

}
