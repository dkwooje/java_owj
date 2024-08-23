package test.controller;

import java.util.Scanner;


public class Test1 {
public static Scanner sc;
	
	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int i = sc.nextInt();
		
		
		if(i%2==0) {
			System.out.println("2의 배수입니다.");
		}
		else  {
			System.out.println("2의 배수가 아닙니다.");
		}
	}

}
