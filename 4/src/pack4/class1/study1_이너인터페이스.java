package pack4.class1;

class A {
	interface B{   //static interface B
		void bcd();		//public abstract
	}
}

class C implements A.B{
	public void bcd() { System.out.println("이너인터페이스 override한 bcd()");}
}
public class study1_이너인터페이스 {
	public static void main(String[] args) {
	
			A.B c = new C();
			c.bcd();
	}

}
//이너인터페이스: 아우터 클래스와 밀접한 관계가 있는 경우에 정의. UI의 이벤트 처리에 가장 많이 사용(클릭 터치). static을 생략한 경우 컴파일러는 자동으로 static 삽입