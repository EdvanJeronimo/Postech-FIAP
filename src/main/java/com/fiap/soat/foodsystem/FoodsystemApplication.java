package com.fiap.soat.foodsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({ "com.fiap.soat.foodsystem.*" })
public class FoodsystemApplication {
//	private final Logger logger = LoggerFactory.getLogger(FoodsystemApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FoodsystemApplication.class, args);
	}

}
