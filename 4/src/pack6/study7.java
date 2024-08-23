package pack6;
/*
class A {
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface {
	public abstract void print();
	
}


class B {
	public<T extends MyInterface> void method1(T t) {
		t.print();
	}
}





public class study7 {

	public static void main(String[] args) {
		
		A a = new A();
		a.method1(5.8);   // = a.<Double>method1(5.8)
		
		B b = new B();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}






*/




//타입제한 기본 문법 구조
//접근지정자 < T extends 최상위클래스명> T 메서드이름(T t){ //부모클래스의 메서드 사용가능 }
