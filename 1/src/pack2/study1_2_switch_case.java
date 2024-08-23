package pack2;

import java.util.Scanner;

public class study1_2_switch_case {

	public static void main(String[] args) {
//		 switch case(특정위치로 점프시키는 역할)
//		break(if문을 제외한 가장 가까운 중괄호{}를 탈출)
			

		int a=2;
		switch (a){
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
			System.out.println();
			
		int b=2;
		switch (b){
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		    System.out.println();
			
		int c=2;
		switch (c){
		case 1:	
		case 2:	
		case 3:
			System.out.println("통과"); break;
		default:
			System.out.println("금지");
		}
		
		
		int t=8;
		if(t>=7) {
			System.out.println("Pass"); 
		}
		else if(t<=10) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		int h=6;
		if((h>=7)&(h<=10)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail"); 
		}
		System.out.println();
		
		System.out.print("점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int e= sc.nextInt();
		switch (e){

		case 1:	
		case 2:	
		case 3:
			System.out.println("통과"); break;
		default:
			System.out.println("금지");
		}
		
		System.out.print("점수 입력: ");
		Scanner qw = new Scanner(System.in);
		int value3 = qw.nextInt();
		if(value3>=90) {
			System.out.println("A학점"); 
		} else if( value3 >= 80) {
			System.out.println("B학점");
		} else if( value3 >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		System.out.println();
		
			
	}

}
