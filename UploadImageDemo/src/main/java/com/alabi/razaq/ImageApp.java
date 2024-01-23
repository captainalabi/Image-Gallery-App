package com.alabi.razaq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.alabi.razaq")
@ComponentScan(basePackages = "com.amazonaws.services.s3")
public class ImageApp{

	public static void main(String[] args) {
		SpringApplication.run(ImageApp.class, args);
	}
}
