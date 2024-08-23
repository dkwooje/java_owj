package com.kh.example.practice2.model.vo;



public class product {

	private String pName;
	private int price;
	private String brand;
	
	public product() {
	this.pName = "이름"; 
	this.price = 3;
	this.brand = "청수";
	}
	
	public void information() {
	System.out.printf("%s %d %s", this.pName, this.price, this.brand);
	}
}
