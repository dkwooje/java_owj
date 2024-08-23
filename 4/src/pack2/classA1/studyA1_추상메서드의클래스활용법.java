package pack2.classA1;


abstract class A{
	int a = 8;
	abstract void abc();
	
}

class B extends A{
	void abc() {
		int a = 3;   //지워보자
		System.out.println(a);
		System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}

public class studyA1_추상메서드의클래스활용법 {

	public static void main(String[] args) {
	  // A a1 = new A(); //추상클래스는 객체를 생성할 수 없다.
		 A b1 = new B();   //추상 클래스
		 B b2 = new B();
		 A a2 = new A() {  //익명 이너 클래스
			 @Override
			 void abc()
			 {
				 System.out.println(a);
				 System.out.println("익명 이너 클래스를 이용한 객체 생성");
			 }
		 };
		 
		 
		 
		 b1.abc();
		 b2.abc();
		 a2.abc();
	}

}


//클래스는 '일반 클래스'와 '추상클래스'로 나뉜다.
//클래스 내에 추상메서드가 하나라도 들어있다면 그 클래스는 추상클래스가 된다.
//A a = new A();를 추상클래스는 만들 수 없다.

//오버라이딩: 부모클래스의 메서드(완성/미완성)을 자식크래스에서 재정의(완성)
//구현하기: 부모클래스의 미완성메서드(추상메서드)를 자식클래스에서 재정의(완성)
//메서드의 완성과 미완성의 구분 기준: 중괄호의 존재 여부
//중괄호안에 아무런 코드가 없어도 완성된 메서드 => 아무일도 하지 말라고 명확히 기능이 표현된 메서드


//익명 이너클래스: 컴파일러가 내부적으로 클래슬를 생성한 후 메서드 오버라이딩 수행
//이너 클래스 형식
//A a = new A() {
//	abc();{
//	 ...
//	}
//};