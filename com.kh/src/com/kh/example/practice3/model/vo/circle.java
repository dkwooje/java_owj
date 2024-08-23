package com.kh.example.practice3.model.vo;

public class circle {

	private double pi = 3.14;
	private int radius;
	
	public circle() {
		
		this.pi = 3.14;
		this.radius = 1;
		
	}
	
	public void incrementRadius() { this.radius++;};
	public void getAreaOfCircle() { System.out.println("면적 : "+ (this.pi*(radius*radius)));}
	public void getSizeOfCircle() { System.out.println("둘레 : "+ (this.pi*(radius*2))); }
}
