package pack1.class4;

class A {
	 int a = 3;		//인스턴스 변수
	void abc() {
		int b = 5;  //지역 변수   //final //final이 부여되면 같은이름의 변수는 다시 사용될 수 없다.
			//지역 이너 클래스
		class B {
			void bcd() {
				
				int c = 8;
				System.out.println(a);
				System.out.println(b);	
				System.out.println(c);
				a = 5; //지역 이너 클래스의 필드값은 final이 붙여지지 않는다.
			  //b = 7;를 쓸 수 있다.
				int b = 7;  //만역 지역 변수에 b값이 정의 되지 않는다면 	int b = 7;를 쓸 수 있다.
				c = 10;
				System.out.println(a);
				System.out.println(b);	
				System.out.println(c);			   
	}
}
		B bb = new B ();
		bb.bcd();
	}
}
public class study4_이너클래스와final {
	public static void main(String[] args) {
		//	 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();
	}
}


//지역 이너클래스
//특징:1 메서드 내부에서 정의된 클래스
//2 아우터 클래스의 필드는 모두 접근가능
//3 메서드 지역변수는 final만 가능(final로 지정하지 않은 경우 컴파일러가 자동으로 지정)
//생성클래스명: 아우터클래스.class
//          아우터클래스$+번호이너클래스.class

//지역변수: 중괄호 내에서 선언된 변수
//매개변수: 메서드에 넘겨주는 변수
//인스턴스변수: 메소드밖 클래스 안에 선언된 변수
//클래스변수: 인스턴스 변수중 타입 선언 앞에 static이 붙여진 변수








