package pack1.class8;

class A{
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {		
		System.out.println("A 클래스 print2");
	}
}
class B extends A{
	@Override
	 void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {		// Overloading  //A클래스와 B클래스의 print2는 다른 매서드이다.
		System.out.println("B 클래스 print2");  
	}
}
public class study8_오버라이딩_메서드 {
	public static void main(String[] args) {
		
		// A 타입 선언 /A 생성자 사용
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		// B 타입 선언 / B 생성자 사용
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		//A 타입 선언 / B 생성자 사용
		A ab = new B();
		ab.print1(); //overriding  된 B클래스의 print1이 실행
		ab.print2(); //상속받은 클래스 A의 print2가 실행
		//ab.print2(10); // 존재하지 않는 자료형
		
		
	}
}
