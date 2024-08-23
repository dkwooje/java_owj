package pack1.class6;


interface A {
	public abstract void abc();
}

class B implements A {
	public void abc() {
		System.out.println("입력매개변수 전달 1");
	}
}
class C {
	void cde(A a) { //다음과 같이 메소드의 매개변수가 클래스타입(객체)인 경우, 객체의 레퍼런스가 복사되어 전달되게 됩니다.
		a.abc();
		System.out.println("입력매개변수 전달 2");
	}
}

public class study6_인터페이스의클래스타입객체 {
	public static void main(String[] args) {
		C c = new C();	
		B b = new B();
		
		c.cde(b); //메서드 cde에 클래스 B의 객체를 전달
		c.cde(new B());	//메서드 cde에 클래스 B의 생성자를 전달
	}
}



//익명이너클래스를 활용한 인터페이스 타입의 매개변수 전달

