package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.service.ShapeService;

@SpringBootApplication
public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		System.out.println("Circle NAME: " + shapeService.getCircle().getName());
		
	}

}
