package pack9;
/*
interface A {void abc();} //void bcd(); } //람다식을 만들기 위한 인터페이스( 딱 하나의 메서드만 존재해야한다.)

class B implements A {
	@Override
	public void abc() {
		System.out.println("메서드 내용 1");
	}
}

public class study1 {
	public static void main(String[]args) {
		
		//1. 객체 지향 프로그래밍 문법 1
		A a1 = new B();
		a1.abc();	//메서드 내용
		
		//2. 객체 지향 프로그래밍 문법 2(믹명 이너 클래스 사용)
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		a2.abc();	//메서드 내용
		
		
		//3. 함수형 프로그래밍 문법(람다식)
		A a3 = () -> {
			System.out.println("메서드 내용 3");
			};
			
		a3.abc();
	}
}

*/

//함수: 기능 동작을 정의 (void abc(){기능 및 동작})
//메서드: 클래스 또는 인터페이스 내부에서 정의된 함수(class A {void abc(){기능 및 동작}}
//메서드와 함수:함수와 메소드 둘다 특정한 무언가를 수행하기 위해 존재한다. 둘의 차이점은 독립적 vs 객체에 종속적이라는 것이다.
//함수는 독립적으로 존재하고, 메소드는 class 및 객체에 종속적이다. 함수는 객체가 필요하지 않고 독립적인 반면, 메서드는 객체와 연결된 함수입니다.

//람다식 개념:자바에서 함수적 프로그래밍 지원 기법
//코드의 간결화 및 병렬처리에 강함(collection API 성능 효과적 개선)
//람다식: 본래의미의 함수적 프로그래밍과 객체지향형의 개념적 비교
//(딱 한개의 추상메서드만을 포함하는 인터페이스를 함수형 인터페이스라고 하고, 이걸 구현하고 호출하는 것이 람다식)




