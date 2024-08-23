package pack1;


class A{
int m = 3;  //인스턴스 필트
static int n = 5;  //정적 필드

}

public class study1_static변수의정의{
	public static void main(String[] args) {
		//인스턴스 필드 활용 방법 (객체 생성후 사용)
		A a1 = new A();
		System.out.println(a1.m);
		//정적 필드 활용방법
		//1. 객체생성 없이 클래스명으로 바로활용
		System.out.println(A.n);
		//2. 객체를 생성한 후 활용(권장하지 않음)
		A a2 = new A();
		System.out.println(a2.n);
			
	}
}

//static 키워드: 객체생성 없이 바로 사용 가능
// static 필드는 객체 생성 없이 사용 가능