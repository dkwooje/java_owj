package pack1.classA1;

class A {
	int m = 3;
}
class B extends A {
	int m = 4;
}
public class studyA1_오버라이딩_인스턴스필드 {
	public static void main(String[]args) {
		// 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		//인스턴스 필드
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);//인스턴스 필드는 오버라이딩이 안된다.
	}
}




