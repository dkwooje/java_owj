package pack6.class2;




class A{
	A() {System.out.println("첫 번째 생성자");
		}
	A(int a){
		System.out.println("두 번째 생성자");
			}
	A(int a, int b){
		System.out.println("세 번쨰 생성자");
					}
}

public class study1_생성자 {
	public static void main(String[] args) {

			A a1 = new A();
			A a2 = new A(3);
			A a3 = new A(3,5);
			// 생성자 오버로딩 후 생성자를 호출해 객체 생성
	}
}
