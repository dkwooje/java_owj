package pack9;
/*
interface A {
	void abc(int k);
}

public class study4 {
	public static void main(String[] args) {
		
		//1. 익명 이너 클래스 
		A a1 = new A() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};
		
		//2. 람다식
		A a2 = (int k )-> {
			System.out.println(k);
		};
		
		//3. 인스턴스 메서드 참조
		A a3 = System.out::println;
		
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3); 
	}
}
*/
//자바 ::더블콜론 이란?
//메소드 레퍼런스라고도 불린다. 자바8 버전에서 소개되었다. 람다식과 똑같은 기능을 한다.

//람다식과 차이점이 있다면 인스턴스를 활용하여 메소드를 전달하는데에 있다.