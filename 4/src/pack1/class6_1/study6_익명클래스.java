package pack1.class6_1;

interface A {
	public abstract void abc();
}

class C {
	void cde(A t) {   //다음과 같이 메소드의 매개변수가 클래스타입(객체)인 경우, 객체의 레퍼런스가 복사되어 전달되게 됩니다.
		t.abc();                                         
		System.out.println("바로 실행123");
		}
	}

public class study6_익명클래스 {
	public static void main(String[] args) {
		
		C c = new C();
		A a = new A() {      // 익명클래스: 객체 a생성과 동시에 new A()를 통한 클래스이다. 하나의 객체(a)만 사용하는 일회용이다.
			public void abc() {                           
				System.out.println("참조변수 만들어서 실행");
			}
		};
		c.cde(a);     
		
				System.out.println("바로 실행");      
				
		c.cde(new A() {  
			public void abc()                              
			{
				System.out.println("참조변수를 안만들고 바로 객체를 만들어서 실행");       
			}
		});
		
	}
}