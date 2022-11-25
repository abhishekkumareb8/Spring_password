package com.ty.personpassword_proj.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.ty.personpassword_proj"})
public class Config {

	@Bean(value = "emf")
	@Scope(value = "prototype")
	public EntityManagerFactory getEMFactory() {

		return Persistence.createEntityManagerFactory("pass");
	}
}
