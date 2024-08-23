package pack3.class6;

interface A {         
	static void cde() { System.out.println("인터페이스 A의 cde()"); }
}
public class study6_인터페이스의static메서드{
	public static void main(String[] args)
	{
		A.cde();
	}
}



//인터페이스 내에 정적 메서드: 클래스 내부의 정적메서드와 사용방법 동일(객체 생성 없이 클래스 이름으로 바 로접근 가능)