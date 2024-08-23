package pack1.class1;


class A {
	public int a =3;
	protected int b = 4;
	int c =5;
	private int d =6;
	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}
	//인스턴스 이너 클래스
	class B {
		void bcd() {
			//아우터 클래스의 필드 사용
			
			System.out.println(a); //(this.a); 에러발생 : class B는 이너클래스로 class B는 객체화되었기 때문에 a는 클래스 B의 a가 아닌 클래스 A의 a이다.
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//아우터 클래스의 메서드 호출
			abc();	
		}
	}
}
public class study1_이너클래스 {
	public static void main(String[] args) {
	//아우터 클래스 객체 생성
		A a = new A();                   //B b = new B(); 생성 불가 
		a.abc();
		//맴버 사용
	
		
		A.B b = a.new B();   //이너클래스는 private도 받을 수 있다.
			b.bcd();
		//	b.abc();//아우터클래스 메서드로 호출 불가능
	
	}

}


//이너 클래스 : 클래스 내부에 포함된 클래스
// 이너클래스 종류: 1. 맴버클래스(인스턴스 이너 클래스, 정적 이너 클래스), 2.지역클래스
//특징: 아우터클래스의 모든 접근지정자의 맴버 접근 가능

//아우터클래스 a = new 아우터클래스();
//아우터클래스.이너클래스 b = 아우터클래스객체.new 이너클래스(); 

//A a = new A();
//A.B b = a.new B();
//b.bcd();



