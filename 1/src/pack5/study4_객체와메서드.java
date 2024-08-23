package pack5;

class D {
	void print() {
		System.out.println("안녕");
	}
	int data() {
		return 3;
	}
	double sum(int a, double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		if(m<0||m>12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월입니다.");
	}
}

public class study4_객체와메서드 {
	public static void main(String[] args) {
		
		D d = new D();
		
		d.print();
		
		int k = d.data();
		System.out.println(k);
		
		double result = d.sum(3, 5.2);
		System.out.println(result);
		
		d.printMonth(5);
		
		d.printMonth(15);

//https://velog.io/@bimilless/%ED%81%B4%EB%9E%98%EC%8A%A4%EC%99%80-%EA%B0%9D%EC%B2%B4-%ED%95%84%EB%93%9C%EC%99%80-%EB%A9%94%EC%84%9C%EB%93%9C
		
		
		
		
	}

}
