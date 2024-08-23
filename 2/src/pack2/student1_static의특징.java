package pack2;


class A{
	int m = 3;   //인스턴스 필드  //각 스택값을 가진다.
	static int n = 5;   //정적 필드  //클래스 영역 공유
}

public class student1_static의특징 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		
		//인스턴스 필드
		a1.m = 5;
		a2.m = 6;
		
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		//정적 필드
		
		a1.n = 7;     
		a2.n = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
		//static 변수는 그 변수와 관련된 모든 주소값을 공유한다.
		
	}
}
