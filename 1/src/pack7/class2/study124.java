package pack7.class2;

public class study124 {

	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	public  void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d + " ");
		System.out.println();
		
		
	}
}
//자바 제어자(modifier) 
//맴버 및 생성자에 사용되는 접근지정자	:  public, protected, default, private
//public: 동일 패키지의 모든 클래스+ 다른 패키지의 모든 클래스에서 사용가능
//protected: 동일 패키지의 모든 클래스+ 다른 패키지의 자식 클래스에서 사용 가능(+ extends)
//default: 동일 패키지의 모든 클래스에서 사용 가능
//private: 동일 클래스에서 사용 가능
//접근지정자가 생략되있다면 자동으로 default값을 가진다.
//클래스에서 사용되는 접근자  public, default(protected, private는 불가능)