package pack5;

import java.util.Arrays;

		class A{
			int m = 3;
			void method() {
				System.out.println("객체 생성 및 활용");
			}
		}
		
		public class study1_method {
			public static void main(String[] args) {
				A a = new A();
				
				System.out.println("a 객체의 필드인 m값을 출력:" + a.m);
				a.m = 5;
				System.out.println("a 객체의 필드가 변경된 후 값:" +  a.m);
				a.method();
				
				
			}
}
		//클래스(class)의 기본 문법
		//클래스 밖에 올수 있는 3가지 (1. package 2.import 3.external class)	
		//클래스 안에 올 수 있는 4가지(1.필드 2.메서드 3. 생성자 4. 내부클래스
		//package: java 파일 폴더
		//import: 다른 폴더(패키지) 위치의 클래스를 참조
		//external class
		//필드: 객체의 속성값을 지정할 수 있는 클래스에 포함된 변수 (int a = 3;)
		//메서드: 클래스의 기능( double abc(){...} )
		//생성자: 객체 생성기능 ( a(){...} )
		//내부클래스