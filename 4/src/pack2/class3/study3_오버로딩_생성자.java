package pack2.class3;

class A {
	A() {
		this(3);  //this를 생략해보자
		System.out.println("클래스 A의 기본 생성자");
	}
	A(int a){
		System.out.println("클래스 A의 정수값을 매개변수로 받는 생성자");
	}
}
	class B extends A {
		B() {
			this(3); //this를 생략해보자    //생략된 super() 가 있다.
			System.out.println("클래스 B의 기본 생성자");
		}
		B(int a){                      //생략된 super() 가 있다.
			System.out.println("클래스 B의 정수값을 매개변수로 받는 생성자");
		}
	}
public class study3_오버로딩_생성자 {
	public static void main(String[] args) {
		// A 객체 생성
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();

		//B 객체 생성
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3);
	}
}



//B() -> this(3) => b(int m){super();->A(){this(3)}->A(int m){출력}
