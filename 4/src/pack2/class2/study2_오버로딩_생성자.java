package pack2.class2;

class A {
	A() {
		System.out.println("A 생성자");
	}
}
class B extends A{
	B() {
		super();  //생략했을 때 컴파일러가 자동 추가(부모 클래스의 생성자 호출)
		System.out.println("B 생성자");
	}
}
class C {
	C(int a){
		System.out.println("C 생성자");
	}
}
class D extends B{
	// 컴파일러 자동으로 추가해 주는 내용 		 
	D() { 
		super();
		System.out.println("D 생성자");
	}
}
public class study2_오버로딩_생성자 {
	public static void main(String[] args) {
		//A 객체 생성
		A aa = new A();
		System.out.println();
		//B 객체 생성
		B bb = new B();
		System.out.println();
		//C 객체 생성
		C cc = new C(3);
		System.out.println();
		//D 객체  생성
		D dd = new D();
		System.out.println();
		
		A ab = new B();
		System.out.println();
	
		
	}
}



//super 키워드 vs super ()메서드
//this();는 자신의 생성자 호출, super();는 부모 생성자 호출