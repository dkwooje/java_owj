package pack2.class8;



 class A {  
	 //final class A //final  클래스는 상속 자체가 불가능
	 
	void abc() {}
	final void bcd() {}
}
class B extends A{
	void abc() {}
	// void bcd() {} // final 메서드는 오버라이딩 불가능
}
final class C {}
// class D extends C {} // final 클래스는 상속 자체가 불가능


public class study8_final클래스와메서드의상속 {
	public static void main(String[]args) {
	
	
	}
}

