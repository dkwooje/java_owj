package pack3.classA1;

class A{
	int a = 3;
	void abc() {
		int b = 5;   //final int b =5;
		class B{
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a=5;
			  //b = 7;
				int b =5;
				System.out.println(a);
				System.out.println(b);
			}
		}
			B bb = new B();
			bb.bcd();
	}
}
public class studyA1_메서드안의_이너클래스_______ {

	public static void main(String[] args) {
				
		A q = new A();
		q.abc();
	}
}
//지역 이너클래스: 메서드 내부에서 정의된 클래스. 아우터클래스의 필드는 모두 접근 가능. 메서드 지역변수는 final만 사용가능(메서드가 종료되면 모든 지역변수는 사라지기 때문
//생성클래스명: A.class, A$1B.class