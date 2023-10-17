package com.bookmyshow.theatre.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TheatreApiApp {
    public static void main(String[] args) {
        SpringApplication.run(TheatreApiApp.class, args);
    }
}