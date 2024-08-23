package pack6.class4;

		class A{
			int m = 6;
			int n = 7;
			void init(int m, int n) {
				m = m;	//this.를 생략시 자동으로 초기값이 나오는데, 변수가 적용될 클래스의 자료형을 찾을 수 없기 때문이다.
				n = n;	
				System.out.println(m);
				System.out.println(n);
				System.out.println();
				System.out.println();
				}
			}
		class B{
			int m;
			int n;
			void init(int m, int n) {
				this.m=m;
				this.n=n;
			}
		}

public class study1_메서드의지역변수분간 {
	public static void main(String[] args) {
			A a =new A();
			a.init(2,3);
			System.out.println(a.m);
			System.out.println(a.n);
			System.out.println();
			System.out.println();
		
			B b = new B();
			b.init(2, 3);
			System.out.println(b.m);
			System.out.println(b.n);
	}

}
