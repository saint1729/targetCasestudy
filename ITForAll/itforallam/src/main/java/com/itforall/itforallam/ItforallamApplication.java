package com.itforall.itforallam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.itforall.itforallam.config.SwaggerConfig;

@SpringBootApplication
@EnableAutoConfiguration
@Import(SwaggerConfig.class)
public class ItforallamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItforallamApplication.class, args);
	}
}