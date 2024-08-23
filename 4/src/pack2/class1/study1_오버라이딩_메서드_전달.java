package pack2.class1;

class A  {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A{
	void abc() { //오버라이딩   //상속 받는 메소드
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {    //상속받지 못한 메소드
		this.abc();
		super.abc();  //부모(A.abc)를 호출한다.
		this.abc();   //this.abc();를 하면 자식(B.abc)을 호출한다.
		super.abc();
	}
}
public class study1_오버라이딩_메서드_전달 {
	public static void main(String[] args) {
		//객체생성
		B bb = new B();
		
		//메서드 호출
		bb.bcd();
	}
}


//super: 부모
//super(): 부모생성자
//this:나