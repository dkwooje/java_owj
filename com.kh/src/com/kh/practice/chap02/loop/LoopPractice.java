package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	private Scanner sc;
	
	public LoopPractice(){
		sc = new Scanner(System.in);
	}
	public void LooPractice1() {
		int num = sc.nextInt();
		if(num >= 1) {
			for(int i = 1; i<=num; i++) {
				System.out.println(i+" ");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void LooPractice2() {
		int num = sc.nextInt();
		do {
			num =sc.nextInt();
		if(num <1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
		}
		else {
			for(int i = 1; i<=num; i++) {
				System.out.println(i+" ");
				}
			}
		} while(num<1);
	}
	
	public void LooPractice3() {
		int num = sc.nextInt();
		if(num >= 1) {
			for(int i = num; i<= 1; i--) {
				System.out.println(i+" ");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	
	
	public void LooPractice5() {
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++)
		{
			sum += i;
			if(i<num) {
				System.out.printf("%d + ", i);
			}
			else {
				System.out.printf("%d =  %d", i, sum);
			}
		}
		
		
	}
	public void LooPractice6() {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 >= 1 && num2 >= 1) {
			int min = num1<num2 ? num1 : num2;
			int max = num1>num2 ? num1 : num2;
		//	int min = Math.min(num1, num2);
		//	int max = Math.max(num1, num2);
			for(int i = min; i<=max; i++) {
				System.out.printf("%d ",i);
			}			
		}
		else {
			System.out.println("1이상의 숫자만을 입력해주세요");
		}
	}
	public void LooPractice7() {
		//생략
	}
	public void LooPractice8() {
		int num = sc.nextInt();
		System.out.printf("===========%d 단==========/n", num);
		for(int i = 1 ; i<=9 ; i++) {
			System.out.printf("%d X %d = %d\n", num,i,num*i);
		}
	}
	public void LooPractice9() {
		int num = sc.nextInt();
		if(num <= 9){
		for(int dan=num; dan<=9; dan++) {
		System.out.printf("===========%d 단==========/n", dan);
		
		for(int i = 1 ; i<=9 ; i++) {
			System.out.printf("%d X %d = %d\n", dan,i,dan*i);
			}
		}
	}
		else {
			System.out.println("9이하의 숫자만 입력해주세요");
		}
	}
	public void LooPractice10() {
		//생략	
	}
	public void LooPractice11() {
		
		int sNum = sc.nextInt();
		int dNum = sc.nextInt();
		for(int i=0; i<10 ; i++) {
			System.out.print(sNum+ " ");
			sNum+=dNum;
		}
	}
	
	public void LooPractice12() {
		
		int num1=0, num2=0;
		double result=0.0;
		String operator="";  //null 과 ""은 주소값의 유무의 차가 있다.
		
		while(!operator.equals("exit")) {
		
		operator = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
			if(operator.charAt(0) == '/' && num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			switch(operator.charAt(0)){
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2 ; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;
				case '%':
					result = num1 % num2; break;
				default:
					System.out.println("없는 연산자 입니다.");
					continue;
			}
			System.out.printf("%d %s %d = %f\n", num1,operator,num2,result);
		}
	}
	public void LooPractice13() {
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			for(int j=1; j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}
	
}