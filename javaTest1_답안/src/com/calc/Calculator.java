package com.calc;

public class Calculator {

	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		System.out.println("�� : " + (first + second));
		System.out.println("�� : " + (first - second));
		System.out.println("�� : " + (first * second));
		
		if(second == 0 || second < 0)
			System.out.println("������ : 0");
		else
			System.out.println("������ : " + (first / second));
		
	}

}
