package pack1.class2;

class A {
	public int a =3;
	protected int b = 4;

	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}
	//인스턴스 이너 클래스
	class B {
			int a =5;
			int b =6;
			void abc() { System.out.println("클래스 B의 메서드 abc()");}
			void bcd() {
		
			//아우터 클래스의 필드 사용
			System.out.println(a); //(this.a); 에러발생 : class B는 이너클래스로 class B는 객체화되었기 때문에 a는 클래스 B의 a가 아닌 클래스 A의 a이다.
			System.out.println(b);
			//아우터 클래스의 메서드 호출
			
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			abc();			
		}
	}
}
public class study2_이너클래스 {
	public static void main(String[] args) {
	//아우터 클래스 객체 생성
		A a = new A();
		a.abc();
		//맴버 사용
		A.B b = a.new B();
		b.bcd();
		b.abc();  //아우터클래스 메서드로 호출 불가능, 이너클래스의 메서드로 호출 가능.
	}
}

//클래스 B는 클래스 A의 변수와 메서드를 클래스 B와메서드를 통해 사용할 수 있다.
//하지만 클래스 A와 메서드로 바로 호출은 불가능하다.
