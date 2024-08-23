package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class practice1 {
	private Scanner ob;
	public practice1() {
		ob = new Scanner(System.in);
	}
	public void practice1() {
		System.out.print( "메뉴 번호를 입력하세요: ");
		int num = ob.nextInt();
		String A[] = {"","입력","수정","조회","삭제","종료"};
		System.out.println(A[num]+"메뉴입니다.");
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = ob.nextInt();
		if(num>0 && num%2 == 0 ) {
			System.out.println("짝수다.");
		}
		else if(num>0 && num%2 != 0) { 
			System.out.println("홀수다.");
		}
		else {
			System.out.println("양수만 입력해 주세요.");
		}	
	}
	public void practice3() {
		System.out.println("국어점수 : ");
		int kor = ob.nextInt();
		System.out.println("수학점수 : ");
		int meth = ob.nextInt();
		System.out.println("영어점수 : ");
		int eng = ob.nextInt();
		
		int sum = kor+meth+eng;
		int avg = (kor+meth+eng)/3;
		if (kor>=40 && meth>=40 &&eng>=40 && avg>60) {
			System.out.println("국어 :" + kor);
			System.out.println("수학 :" + meth);
			System.out.println("영어 :" + eng);
			System.out.println("합계 :" + sum);
			System.out.println("평균: " + eng);							
			System.out.println("축하합니다, 합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}		
	}
	public void practice4() {
	System.out.print("1~12 사이의 정수 입력: ");
		int season = ob.nextInt();
		switch(season) {
		case 3: case 4: case 5:
			System.out.println(season+"월은 봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println(season+"월은 여름입니다."); break;
		case 9: case 10: case 11:
			System.out.println(season+"월은 가을입니다."); break;
		case 12: case 1: case 2 :
			System.out.println(season+"월은 겨울입니다."); break;
		default :
			System.out.println(season+"월은 잘못 입력된 달입니다.");
		}
	}
	public void practice5() {
		System.out.print("아이디: ");
		String ID = ob.next();
		System.out.print("비밀번호: ");
		String PASS = ob.next();
		
		if((ID.equals("myId")) && (PASS.equals("myPassword12"))) {
			System.out.println("로그인 성공");	
		}
		else if((ID.equals("myId"))) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else  {
			System.out.println("아이디가 틀렸습니다.");
		}
}
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String user = ob.next();
		
		
		if(user.equals("관리자")) {
			System.out.print("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글작성 가능"); 
		} 
		else if(user.equals("회원")) {
			System.out.print("게시글 작성, 게시글 조회, 댓글작성 가능" );	
		} 
		else {
			System.out.print("게시글 조회만 가능");
		} 
	}
	public void practice7() {
	System.out.print("키(m)를 입력해 주세요 :");
	double hig = ob.nextDouble();
	System.out.print("몸무게(kg)를 입력해 주세요 :");
	double wet = ob.nextDouble();
	double BMI = wet/(hig*hig);
	System.out.println("BMI 지수 :"+BMI);
	if (BMI<18.5) {
		System.out.println("저체중");
	}
	else if(BMI>=18.5 && BMI<23) {
		System.out.println("정상체중");
	}
	else if(BMI>=23 && BMI<25) {
		System.out.println("과체중");
	}
	else if(BMI>=25 && BMI<30) {
		System.out.println("비만");
	}
	else if(BMI>=30) {
		System.out.println("고도 비만");
	}
}/*
	public void practice8() {
	System.out.print("피연산자1 입력 : ");
	int a = ob.nextInt();
	System.out.print("피연산자2 입력 : ");
	int b = ob.nextInt();
	System.out.print("연산자를 입력(+,-,*,/,%) : ");
	 char c = ob.next().charAt(0);  //연산자는 char
	if (a<=0 || b<=0 ) {
		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); 
	}
	else if ( ) {
		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); 
	}
	else {
		System.out.println( a c b );
	}
	
}*/
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int a = ob.nextInt();
		System.out.print("기말 고사 점수 : ");
		int b = ob.nextInt();
		System.out.print("과제 점수 : ");
		int c = ob.nextInt();
		System.out.print("출석 회수 : ");
		int d = ob.nextInt();
		int A = (a*20)/100;  //a*0.2
		int B = (b*30)/100;  //b*0.3
		int C = (c*30)/100;  //c*0.3
		int D = ((d*100/20)*20)/100;  //d
		int sum = A+B+C+D;
		if(sum>=70 && (d*100/20)>30) {
			System.out.println("중간 고사 점수(20):" + A);
			System.out.println("기말 고사 점수(30):" + B);
			System.out.println("과제 점수(30):" + C);
			System.out.println("출석 점수(20):"+ D);
			System.out.println("총점 :"+ sum);
			System.out.println("PASS");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public void practice10() {
		System.out.print("실행할 기능을 선택하세요");
		int a = ob.nextInt();
		switch(a) {
		case 1: System.out.println("메뉴 출력"); break;
		case 2: System.out.println("짝수/홀수"); break;
		case 3: System.out.println("합격/불합격"); break;
		case 4: System.out.println("계절"); break;
		case 5: System.out.println("로그인"); break;
		case 6: System.out.println("권한 확인"); break;
		case 7: System.out.println("BMI"); break;
		case 8: System.out.println("계산기"); break;
		case 9: System.out.println("P/F"); break;
		default: System.out.println("다시 입력해주세요");
		}
	}
	
	
}  