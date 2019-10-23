package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.model.Circle;
import com.example.demo.model.Triangle;

@Component
public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		System.out.println("get Circle called");
		return circle;
	}
	public void setCircle(Circle circle) {
		System.out.println("set Circle called");
		this.circle = circle;
	}
	public Triangle getTriangle() {
		System.out.println("get Triangle called");
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
