package com.dcazalla.simplewebproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //(scanBasePackages = {"com.dcazalla.simplewebproject.*"})
@ComponentScan({"com.dcazalla.simplewebproject.*", 
	"com.dcazalla.simplewebproject.controller.*",
	"com.dcazalla.simplewebproject.model.*",
	"com.dcazalla.simplewebproject.repository.*"})
@EntityScan(basePackages = {"com.dcazalla.simplewebproject.model"})
@EnableJpaRepositories("com.dcazalla.simplewebproject.repository.*")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}