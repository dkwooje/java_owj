package com.kh.test.shape.model.vo;

import java.util.Scanner;

public class Circle {
	
	private Scanner sc;
	public double radius;
	public static final double PI = 3.14;
	
	public Circle(){
	sc = new Scanner(System.in);
	}
	
	public void setRadius() {
		System.out.print("반지름 길이 : (cm)");
		double radius =  sc.nextDouble();
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("반지름" + radius + "cm인 원을 그립니다.");
	}
	
}
