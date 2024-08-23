package pack3.classA5;

interface A {
	void abc();
}
class C{ 
	void cde(A a) {
		a.abc();
	}
}
public class studyA5_참조변수와익명클래스 {

	public static void main(String[] args) {
			C c = new C();
			A a = new A() {
				
				public void abc() {
					System.out.println("참조변수를 만들어서 실행");
				}
			};
			c.cde(a);
			
			c.cde(new A() {
					public void abc() {
						System.out.println("참조변수를 안만들고 바로 객체를 만들어서 실행");
			}
		});
	}
}
