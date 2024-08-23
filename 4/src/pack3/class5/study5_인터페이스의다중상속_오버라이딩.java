package pack3.class5;


interface A {         
	void abc();                       //A는 인터페이스이다. interface의 메소드는 보이지 않는 public abstrict가 붙여진다.
	default void bcd() {           // 나중에 추가된 bcd()는 에러가 발생한다. 하지만 default를 넣어주면  void bcd()는 이미 완성되어 자식클래스로부터 오버라이딩이 안된다.
		System.out.println("A 인터페이스의 bcd()");
	}
}
class B implements A {         //B는 클래스이다. class의 메소드에는 보이지 않는 defualt가 붙여져 있다.
	public void abc() {			//인터페이서와 클래스 간의 상속에서 메소드 앞에 보이지 않는 defualt와 public 을 신경써야 한다.
		System.out.println("B 클래스의 abc()");
	}
}
class C implements A {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		A.super.bcd();  //인터페이스는 다중상속이 가능하여 어느곳에서 가져왔는지 클래스나 인터페이스 명을 super앞에 붙여야 한다.
		System.out.println("C 클래스의 bcd()");
	}
}
public class study5_인터페이스의다중상속_오버라이딩 {

	public static void main(String[] args) {

		A a1 = new B();
		A a2 = new C();
		
		a1.abc();
		a1.bcd();
		System.out.println();
		a2.abc();
		a2.bcd();
	}

}


//인터페이스(규격) 사용 목적 : 유지보수 감소를 위해 ,코드 에러 방지
//디폴트(defualt) 메서드 : 인터페이스 내부의 완성된 메서드
// 완성된 메서드이기 때문에 구현 클래스가 반드시 오버라이딩 할 필요는 없다.
