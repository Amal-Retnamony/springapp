package com.qburst.amaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.qburst.controller")
@SpringBootApplication
public class AmaldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmaldemoApplication.class, args);
	}
}
