package pack6;
/*
class A {}
class B extends A {}
class C extends B {}

class D <T extends B> {   //B와 C만 올 수 있음
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class study6 {

	public static void main(String[] args) {
		//D<A> d1 = new D<>(); //불가능
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();   //D<B> d4 = new D<>();
		
		d2.set(new B());
		d2.set(new C());
		
		// d3.set(new B());
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
		
		
		
	}
}

*/



//제네릭 메서드 내에서 사용가능한 메서드 : Object 클래스의 메서드만 사용 가능
//제네릭 타입 범위 제한의 필요성: 만일 T가 과일클래스 또는 그 하위 클래스만 올 수 있도록 한정하면
//Goods는 과일류만을 저장하는 제네릭 클래스로 정의 가능
//과일류 또는 문구류만 저장하는 것은 불가능

//제네릭 클래스의 타입 제한
//제네릭 메서드의 타입 제한
//일반메서드 매개변수로서의 제네릭 클래스 타입제한


//class A {
//	public <T> void method1(T t) {
//		t.equals("안녕");     //t.length();  
//	}
//}