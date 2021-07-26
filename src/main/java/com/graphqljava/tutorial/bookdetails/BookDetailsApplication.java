package com.graphqljava.tutorial.bookdetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yml")
public class BookDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsApplication.class, args);
	}



}
