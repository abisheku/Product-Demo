package com.products.productDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.products")
public class ProductDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDemoApplication.class, args);
	}

}
