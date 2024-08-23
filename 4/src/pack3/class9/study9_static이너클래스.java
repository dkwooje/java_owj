package pack3.class9;


class A{
	int a =3;
	static int b =4;
	void method1() { System.out.println("Instance method");}
	static void method2() {System.out.println("Static method");}
	
	static class B{
		void bcd() {
			//System.out.println(a);
			System.out.println(b);
			method2();
			//method1();
		}
	}
}

public class study9_static이너클래스 {

	public static void main(String[] args) {

			A.B b = new A.B();
			b.bcd();
	}
}

//정적 맴버 이너클래스 : 아우터 클래스의 static 맴버만 접근 가능
//아우터클래스.이너클래스 a = new 아우터클래스.이너클래스();
//static을 붙이면 메모리 누수 위험이 없다.