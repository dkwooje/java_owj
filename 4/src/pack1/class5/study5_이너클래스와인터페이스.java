package pack1.class5;


interface C {
	public abstract void bcd(); //인터페이스는 메서드와 객체를 만들 수 없다. 하지만 추상메서드는 가능하다.
}
class A  {
	C c = new B();
	void abc() {
		c.bcd();
	}
	
	class B implements C {      
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
}





public class study5_이너클래스와인터페이스 {
	public static void main(String[] args) {
		// 객체 생성 및 메서드 호출
		A a = new A();
		
		a.abc();
	}
}
//클래스 B는 클래스 A의 이너클래스로 A의 변수와 메서드를 클래스 B와메서드를 통해 사용할 수 있다.
//클래스 B는 인터페이스 C의 상속을 받는다. 클래스 B는 인터페이스 C와 주소공유가 가능하다.
//클래스 A는 인터페이스 C의 객체를 만들 수 있고, 메서드 호출도 가능하다.


//익명이너클래스 :익명(이름을 알 수 없음) + 이너클래스

//익명이너클래스는 이름이 없어 한번에 객체 2개 이상 생성 불가능.










