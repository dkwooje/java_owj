package pack6;

//Apple 클래스와 Apple 클래스를 담을 수 있는 Goods1 클래스
class Apple {}
class Goods1 {
	private Apple apple = new Apple();
	public Apple getApple() {          //get
		return apple;   
	}
	public void setApple(Apple apple) {   //set
		this.apple = apple;
	}
}

//pencil 클래스와 pencil 클래스를 담을 수 있는 Goods2 클래스
class Pencil {}
class Goods2 {
		private Pencil pencil = new Pencil();
		public Pencil getPencil() {             //get
			return pencil;
		}
		public void setPencil(Pencil pencil) {   //set
			this.pencil = pencil;
		}
}

public class study1 {
	public static void main(String[] args) {
		//Goods1을 이용해 Apple 객체를 추가하거나 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());     //set
		Apple apple = goods1.getApple();  //get
		
		// Goods2를 이용해 Pencil 객체를 추가하거나 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());   //set
		Pencil pencil = goods2.getPencil();  //get
		
	}
}



//제네릭(Generic): 상품을 저장할 수 있는 클래스 생성. 사과를저장(set)하고 가져오기 (get).
//인터페이스(interface):
//제네릭(Generic)은 직역하자면 '일반적인'이라는 뜻이다.  조금 더 부연설명을 하자면 '데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법'이다.
// 생각해보자. 만약에 우리가 어떤 자료구조를 만들어 배포하려고 한다. 그런데 String 타입도 지원하고싶고 Integer타입도 지원하고 싶고 많은 타입을 지원하고 싶다. 그러면 String에 대한 클래스, Integer에 대한 클래스 등 하나하나 타입에 따라 만들 것인가? 그건 너무 비효율적이다. 이러한 문제를 해결하기 위해 우리는 제네릭이라는 것을 사용한다.
//타입설명  :  <T>	Type /<E>	Element / <K>	Key / <V>	Value / <N>	Number

