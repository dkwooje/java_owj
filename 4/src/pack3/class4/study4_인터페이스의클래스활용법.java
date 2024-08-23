package pack3.class4;


interface A {
	int a = 3;
	void abc();
}
class B implements A {
	public void abc() {
		System.out.println(a);
		int a = 77;
		System.out.println(a);
		System.out.println("방법 1 . 자식 클래스 생성자로 객체 생성");
		
	}
}
public class study4_인터페이스의클래스활용법 {
	public static void main(String[] args ) {
		
		A a1 = new A() {
			public void abc() {
				System.out.println(a);
				System.out.println("익명 이너클래스를 이용한 객체 생성 및 호출");
				System.out.println();
				System.out.println();
			}
		};
		a1.abc();
//			
		A b1 = new B();

		b1.abc();
	}
}


//인터페이스의 객체생성 (자체로는 객체 생성 불가)
//방법1 : 인터페이스를 일반클래스로 상속하요 객체생성
//방법2: 익명이너클래스 사용
// 인터페이스의 객체생성방법은 추상클래스 객체생성방법과 동일