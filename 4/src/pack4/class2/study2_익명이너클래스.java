package pack4.class2;

class A {
	interface B{   //static interface B
		void bcd();		//public abstract
	}
}

public class study2_익명이너클래스 {
	public static void main(String[] args) {
	
			A.B c = new A.B() {
				public void bcd() {
					System.out.println("익명 이너클래스를 이용한 bcd실행");
				}
			};
			c.bcd();
	}

}
