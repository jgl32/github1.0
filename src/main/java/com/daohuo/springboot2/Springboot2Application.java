package com.daohuo.springboot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.daohuo.springboot2.mapper")
public class Springboot2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2Application.class, args);
	}

}
