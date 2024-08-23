package pack2.class5;

class A {
	String name;
	A(String name) {
		this.name = name;
	}
}

class B {
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) { //equals 메서드는 모든 객체를 받는다/
	
		if(this.name == ((B)obj).name) {  //이 name과 B의 name과 비교
			return true;
		} else
			return false;
	}
}
public class study5_equals {
	public static void main(String[] args) {

		A a1 = new A("안녕");
		A a2 = new A("안녕");
		//A a2 = a1;
			System.out.println(a1.name);
			System.out.println(a1 == a2);
			System.out.println(a1.equals(a2)); //Java에서 Object 클래스의 equals 메서드는 기본적으로 객체의 참조(reference)를 비교  //a1과 a2는 서로 참조 값이 다르므로 해시코드가 다르게 나온다 따라서 false
												//만약 A a2 = a1이라고 했다면 a2가 a1을 참조하므로 true가 나왔을 것이다.
			B b1 = new B("안녕");
			B b2 = new B("안녕");
			System.out.println(b1.name);
			System.out.println(b1 == b2);
			System.out.println(b1.equals(b2)); //객체 b1으로 하여금 클래스 B의 메서드 equals로 도출
	}
}

//Object 메서드 : equals()
// a.equals(b) : a와 b의 이름을 비교. 같으면 true 아니면 false	
//equals 메서드는 Object의 메서드로서, Object클래스가 가지고 있는 equals 메서드의 기능 두 객체의 hashcode값을 비교하는데, 이 hashcode는 객체의 생성위치를 hash화해서 보유하므로, 생성위치가 다른 두 객체의 hashcode값은 달라, false를 출력
//equals 메서드의 기본기능은 객체의 주소값을 비교하는데, 다른 객체는 다른 주소값을 가지므로 false