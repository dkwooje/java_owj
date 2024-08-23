package pack3.class8;

class A{
		public int a= 3;
		protected int b =4;
		int c = 5;
		private int d = 6;
		void abc() {
			System.out.println("클래스A의 메서드 abc()");
		}
		class B{
			int a = 5;
			int b = 6;
			void abc() {System.out.println("클래스 B의 메서드 abc()");}
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				abc();   //B클래스의 메서드
				 
				System.out.println(A.this.a);
				System.out.println(A.this.b);
				A.this.abc();  //A클래스의 메서드
			}
		}
	}

public class study8_이너클래스의중복이름메서드 {

	public static void main(String[] args) {
		A a = new A(); //아우터클래스 a = new 아우터클래스
		A.B b = a.new B(); //아우터클래스.이너클래스 b = 아우터클래스객체.new 이너클래스()ㅣ
		b.bcd();

	}
}

//이너클래스: 아우터 클래스의 모든 접근지정자의 맴버 접근 가능