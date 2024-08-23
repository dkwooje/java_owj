package pack2;

import java.util.Scanner;

public class study1_1_if {

	public static void main(String[] args) {
	//  제어문과 제어키워드
	//   선택제어문(if,switch), 반복제어문(for,while,do-while)
				
			
		
		 //if else else if
		int value1 = 5;
		if(value1 >3 ) {
			System.out.println("실행1");
		}
		if(value1 <5) {
			System.out.println("실행2");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if(bool1) {
			System.out.println("실행3");
		}
		if(bool2) {
			System.out.println("실행4");
		}
			
		int value2 = 5;
		if(value2 > 3) {
			System.out.println("실행5");
		}
		else {
			System.out.println("실행6");
		}
		
		System.out.println((value2 >3)? "실행5":"실행6");
		System.out.println();
		
		System.out.print("점수 입력 : "); //90
		Scanner sc = new Scanner(System.in); //Scanner 함수 : 값을 입력하는 함수
		int value3 = sc.nextInt(); 
		if(value3 >= 90) {
			System.out.println("A학점");
		}
		else if(value3 >= 80) {
			System.out.println("B학점");
		}
		else if(value3 >= 70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		if(value3 >= 70) {
			System.out.println("C학점"); 
		}
		else if(value3 >=80) {
			System.out.println("B학점");
		}
		else if(value3 >= 90) {
			System.out.println("A하점");
		}
		else {
			System.out.println("F학점");
		}
		
		if(value3 >= 70 && value3 < 80) { 
			System.out.println("C학점"); 
		}
		else if(value3>=80 && value3 <90) {
			System.out.println("B학점");
		}
		else if(value3 >= 90) {
			System.out.println("A학점"); 
		}
		else{
				System.out.println("F학점");
			}
	

	}

}
