package pack3.classA4;

interface A{
	int a = 3;
	void abc();
}

class B implements A{
		
		public void abc() {
			System.out.println("입력매개변수 전달");
			System.out.println(a);
		}
}
class C{
	void cde(A a) {
		a.abc();
	}
}
public class studyA4_인터페이스_전달 {
	public static void main(String[] args) { 
		C c = new C();  					
		B b = new B();
		c.cde(b);
		c.cde(new B());
		
	}
}
