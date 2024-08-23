package pack6.class3;


	class A { //클래스 내부에서 필드, 메서드에 앞에 붙는 자동으로 붙는 this 키워드
			int m;
			int n;
		void init(int m, int n) {    //init : 초기화 하다.
				int c;
				c = 3;
				this.m = m;  //this.를 생략했을 때 자동으로 추가
				this.n = n;  //this.를 생략했을 때 자동으로 추가
		}
		public void work() {
			this.init(123, 15616);    //this.를 생략했을 때 자동으로 추가
		}
	}
				
public class study1_메서드의공유 {
	public static void main(String[] args) {
		
			//클래스 객체 생성
			A a = new A();
			//메서드 호출 / 필드값 활용
			
			a.work();
			System.out.println(a.m);
			System.out.println(a.n);
	}
}
