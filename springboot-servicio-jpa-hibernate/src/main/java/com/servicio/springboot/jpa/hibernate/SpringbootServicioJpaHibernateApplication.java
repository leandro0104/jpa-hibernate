package com.servicio.springboot.jpa.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(info = @Info(title = "Product API",version = "2.0", description = "Documentacion Servicios" ))
@SpringBootApplication
public class SpringbootServicioJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioJpaHibernateApplication.class, args);
	}

}
