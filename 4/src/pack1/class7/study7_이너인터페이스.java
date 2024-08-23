package pack1.class7;

class A{
	interface B{          //static interface        
		 void bcr(); // public abstract                // 모든 메서드와 연결
	}
}

class C implements A.B{  //B가 static으로 구현되어 있기 때문에
	public void bcr() {
		System.out.println("이너 인터페이스 구현 클래스 생성");
	}
}
	public class study7_이너인터페이스{
		public static void main(String[]arge) {
			// 객체 생성 방법 1 (자식 클래스 직접 생성)
			A.B c = new C();
			c.bcr();                
			System.out.println("생성");
			// 객체 생성 방법 2(익명 이너 클래스 생성)
			A.B b = new A.B() {
				public void bcr() {
					System.out.println("익명 이너 클래스로 객체 생성");
			}
		};	
		     b.bcr(); //A.B b = new A.B()
		     System.out.println("생성");
	}
}

//이너인터페이스: 아우터 클래스와 밀접한 관계가 있는 경우에 정의, UI의 이벤트 처리에 가장 많이 사용, static을 생략한 경우 커마일러는 자동으로 static 삽입
//이너인터페이스는 정적이너인터페이스만 가능(static 자동으로 추가)