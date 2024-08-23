package pack5;

import  java.util.Arrays;

	    class B{
			int m = 3; //필드 
			int n = 4; //필드
			void work1() {
				int k = 5;  //지역변수
				System.out.println(k);
				work2(123);
			}
			void work2(int i) {			//매개 변수 (전달받은 변수) 11번째 줄로 대입받는다.
										//위의 work2(int i); 대신 이자리에 int i = 3; 넣으면 위의 classA로 부터 호출이 불가능하다.
				int j = 4;				//지역변수
				System.out.println(i + j);
			}
		}
		
	public class study2_필드와지역변수 {
		public static void main(String[] args) {		//클래스로 객체 생성
			B b = new B();
			System.out.println(b.m);  //메서드 호출
			System.out.println(b.n); //메서드 호출
			b.work1();
			
	}
}
