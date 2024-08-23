package pack1.classA2;

class A {
	static int m = 3;
}
class B extends A {
	static int m = 4;
}
public class studyA2_오버라이딩_static필드 {
	public static void main(String[] args) {
		//클래스명으로 바로 접근
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println();
		
		//객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//aa.m = 7;
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}
}

//스태틱 필드는 오버라이딩 되지 않는다. 
//오버라이딩은 저장공간이 공용으로 사용되면 사용가능하다.
//저장공간이 별개라면 사용이 불가능 하다.
//상속관계에서 오버라이딩은 인스턴스 메서드에서만 일어난다.