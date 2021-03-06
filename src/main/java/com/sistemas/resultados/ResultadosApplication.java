package com.sistemas.resultados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ResultadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResultadosApplication.class, args);
	}

}
