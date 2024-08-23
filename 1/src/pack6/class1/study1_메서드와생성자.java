package pack6.class1;

class A {
	int m;

	void work() {
		System.out.println(m);
	}
	 A(){} //생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가
}

class B {
	int m;

	void work() {
		System.out.println(m);
	}

	B() {
	}
}

class C {
	int m;

	void work() {
		System.out.println(m);
	}

	C(int a) {
		m = a;
	}

	C() {
	}
}
// 기본 생성자를 컬파일러가 만들어주는 요건 ->클래스 내부에 생성자가 아무것도 없어야 함
// 매개변수를 받는 생성자가 있는 경우, 기본생성자는 아예없다.(임의로 기본 생성자를 추가할 수 있다)

public class study1_메서드와생성자 {
	public static void main(String[] args) {

		// 클래스 객체 생성 및 생성자 대입
		A a = new A();
		B b = new B();
		C c = new C(3);
		C d = new C(6);

		// 메서드 호출
		a.work();
		b.work();
		c.work();
		d.work();
	}
}
