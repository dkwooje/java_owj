package pack3.classA3;

interface C{
    int a = 3;
	void bcd();
}
class A{

	void abc() {
		C c =new B();
		c.bcd();
	}
}
	class B implements C{
		public void bcd() {
			
			System.out.println(a);
			System.out.println("인스턴스 이너 클래스");
		}
	}
public class studyA3_인스턴스이너클래스 {
	public static void main(String[] args) {
			A a = new A();
			a.abc();
	}
}

//인스턴스 클래스(instance class)	외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 인스턴스멤버처럼 다루어진다.
//https://dkswnkk.tistory.com/540