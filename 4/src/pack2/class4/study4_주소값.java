package pack2.class4;

class A {  // extends object(컴파일러에 따라 자동으로 추가)
	int a = 3;
	int b = 4;
}

class B {
	int a = 3;
	int b = 4;
	
	@Override //생략해도 이상없다.
	public String toString() {
		
		return "필드값(a,b) = " + this.a + " "+this.b;
	 ////   return super.toString(); 위 문항과 바꿔보자
	}
}
	
public class study4_주소값 {
	public static void main(String[]args) {
		
		//객체 생성
		A a = new A();
		B b = new B();
		
		//메서드 호출
		System.out.printf("%x\n", a.hashCode());// hashcode를 16진수로 표현
		System.out.println(a.toString());
		System.out.println();
		System.out.println(a);//보이지 않지만 a.toString();이 있다.
		System.out.println(b);//보이지 않지만 b.toString();이 있다.
	}
}




// Object 클래스 : 모든 자바 클래스의 부모 클래스
//자바의 모든 클래스는 object의 자식클래스 = 자바의 모든 클래스는 object의 메서드를 가짐

