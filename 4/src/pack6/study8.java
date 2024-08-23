package pack6;

/*
class A{}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

class Test {
	void method1(Goods<A> g) {}
	void method2(Goods<?> g) {}
	void method3(Goods<? extends B> g) {}
	void method4(Goods<? super B> g) {}
}

public class study8 {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());

		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());	
	}
}






*/

//메서드 매개변수로서의 제네릭 클래스 타입제한
//메서드의 매개변수로 제네릭 클래스 객체가 오는 경우의 타입제한

//method(Goods<A> v) :A만가능
//method(Goods<?> v) :A,B,C,D가능
//method(Goods<? extends B> v) :B,C,D만가능
//method(Goods<? super B> v) :A, B만가능
//와일드 카드 <?> 은 <? extends Object> 와 마찬가지라고 했다. Object는 자바에서의 모든 API 및 사용자 클래스의 최상위 타입이다. 