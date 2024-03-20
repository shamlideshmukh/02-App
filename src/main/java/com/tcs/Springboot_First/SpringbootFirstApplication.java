package com.tcs.Springboot_First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstApplication {

	public static void main(String[] args) {
		System.out.println("Spring Project Start.....");
		SpringApplication.run(SpringbootFirstApplication.class, args);
		System.out.println("Spring Project end.....");
	}

}
