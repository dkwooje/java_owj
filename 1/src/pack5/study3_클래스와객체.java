package pack5;


class C	{
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1); //필드는 초기화 하지 않아도 값이 강제 초기화돼 출력 가능
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
	int k; //int k =0; 초기화 하면 사용 가능
	  //=System.out.println(k); //로컬 변수는 초기화가 되지 않아 에러가 발생한다.
	}
}

	public class study3_클래스와객체 {
			public static void main(String[] args) {

				C c = new C(); //클래스를 활용해 객체 생성
				
				c.printFieldValue();   //객체 활용
				c.printLocalVariable();
		
	}

}
