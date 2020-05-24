package com.azuredemo.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


import democontroller.DemoController;


@SpringBootApplication
@ComponentScan(basePackageClasses = DemoController.class)
//@EnableJpaRepositories("demoncontroller")
//@EntityScan("democontroller")
public class AzuredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuredemoApplication.class, args);
	}

}
