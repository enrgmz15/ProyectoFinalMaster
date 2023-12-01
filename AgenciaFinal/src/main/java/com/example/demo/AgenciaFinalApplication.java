package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Enrique
 *
 */
@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages="com.curso.DAO")
@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service"})
public class AgenciaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgenciaFinalApplication.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
