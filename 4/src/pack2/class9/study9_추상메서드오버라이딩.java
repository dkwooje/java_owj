package pack2.class9;


abstract class Animal{      //추상클래스
	abstract void cry();   //추상메서드: 기능을 하는 중괄호{}를 넣을 수 없다.
}

//class Animal {
//	void cry() {}   
//}
class Cat extends Animal {
		 void cry() {   
			System.out.println("야옹");
		}
	}
class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}
public class study9_추상메서드오버라이딩 {
	public static void main(String[] args) {
		
		Animal animal1 = new Cat(); 
		Animal animal2 = new Dog();
		
		animal1.cry(); //Animal 클래스 내의 cry()메서드가 있어 호출 가능
		animal2.cry(); //Animal 클래스 내의 cry()메서드가 있어 호출 가능
	}
}


//abstract : 추상적/ 메서드 자체는 아무러 기능을 수행하지 않음. 이 메서드의 존재 목적: 부모타입으로 cry()호출을 위해 기능이 없으니 메서드의 이름만 정의 -> 추상 메서드
//추상 메서드의 정의법 :1. 리턴타입 앞에 abstract 2. 기능을 정의하는 {}생략 3. ;