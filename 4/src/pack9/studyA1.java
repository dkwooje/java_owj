package pack9;
/*
interface A{
	B abc(int k);
}

class B{
	B() {
		System.out.println("첫 번쨰 생성자");
	}
	B(int k) {
		System.out.println("두 번쨰 생성자");
	}
}

public class studyA1 {
	public static void main(String[] args) {
			
		//1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(3); 
			}
		};
		
		//2. 람다식
		A a2 = (int k) -> new B(3);   
		
		//3. 클래스 생성자 참조
		A a3 = B::new;
		
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}

}

*/