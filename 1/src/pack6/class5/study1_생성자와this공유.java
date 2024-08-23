package pack6.class5;

//this 키워드 vs this() 메서드
//this() 자기 클래스 내부의 다른 생성자를 호출

class A{
	A(){                // 및의 this()로부터 넘어온다.
		System.out.println("첫 번째 생성자");
	}
	A(int a){
		this();  //생성자 호출은 생성자의 첫줄에서만 가능하다.         
		System.out.println("두 번쨰 생성자");
	}
	A(String str){
		this(12); //A(), A(int), A(str) 실행됨
		System.out.println("세 번째 생성자");
	}
}
public class study1_생성자와this공유 {
	public static void main(String[] args) {
	

		A a1 = new A();         //첫 번째 생성자 호출
		System.out.println();
		System.out.println();
		
		A a2 = new A(3);        //두 번째 생성자 호출(생성자의 내부에서 첫 번째 생성자 호출) 결국 A()와 A(int a) 둘다 실행
		System.out.println();
		System.out.println();
		
		A a3 = new A("hi");
		System.out.println();
		
	}

}
