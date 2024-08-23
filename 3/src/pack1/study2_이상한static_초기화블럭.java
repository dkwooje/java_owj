package pack1;

class B {
	int a=3;
	static int b;
	static {   //초기화블록
		b=5;   
		System.out.println("클래스 B가 로딩됐습니다!!");  //main보다 먼저 출력된다.
		  
	}
	B(){
		
		a = 3;  // 인스턴스 필드 초기화는 일반적으로 생성자에서 수행
	}
}

public class study2_이상한static_초기화블럭 {
	public static void main(String[]args) {
		
		System.out.println(B.b);        
		B.b = 7;
		System.out.println(B.b); 
		//B.b가 실행되는 시점에서 클래스 B가 메모리에 로딩되며 이때 static{}초기화 블록 실행	
		//초기화블록은 클래스가 처음로딩될 때 '딱 한 번'만 수행된다.(중복예방)
	}
}


