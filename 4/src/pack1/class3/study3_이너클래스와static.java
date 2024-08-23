package pack1.class3;

class A {
	int a =3;
	static int b =4;
	void method1() {
		
		System.out.println("인스턴스 메서드");
		
	}
	static void method2() {
		System.out.println("static method");
	}
	
	static class B{
		void bcd() {
			
			System.out.println(b);
			//System.out.println(a); 오류/ 스태틱클래스는 스태틱 자료형만 호출 가능하다.
			method2();
			//method1(); 오류/ 스태틱클래스는 스태틱 메소드만 호출 가능하다.
			
		}
	}
}
public class study3_이너클래스와static {
		public static void main(String[] args) {
			
			A.B b = new A.B(); //static 이너클래스는 이너클래스에 접근하기위해 A객체를 생성할 필요가 없다.
			
			b.bcd();
		//	b.method1();
		//	b.method2(); // 아우터 클래스의 메서드 호출 불가능
		}
}



//아우터클래스의 static 맴버만 접근 가능

//아우터클래스.이너클래스 a = new 아우터클래스.이너클래스();
//A.B b = new A.B();
//b.bcd();

