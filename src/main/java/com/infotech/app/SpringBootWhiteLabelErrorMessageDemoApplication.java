package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.infotech.controller" }) //we need to include this annotation because controller packages is not in hierarchy of boot strap class
public class SpringBootWhiteLabelErrorMessageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWhiteLabelErrorMessageDemoApplication.class, args);
	}

}
