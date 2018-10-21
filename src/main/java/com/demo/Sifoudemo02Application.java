package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages="com.demo.web.servlet")
public class Sifoudemo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Sifoudemo02Application.class, args);
	}
}
