package pack5;

public class studyA1_메서드와오버로딩 {
	public static void main(String[] args) {

		
		print();
		print(3);
		print(5.8);
		print(2,5);
		
	}
	public static void print() {System.out.println("데이터가 없습니다.");}
	public static void print(int a) {System.out.println(a);}
	public static void print(double a) {System.out.println(a);}
	//public static void print(double b) {System.out.println(b);}
	//변수형이 다르다지만, 문자열이 같으면  해서 중복처리가 된다.
	//중복처리가 되면 진행이 되지 않는다.
	public static void print(int a ,int b) {System.out.println(a+b);}
	//public static int print(int a, int b) {System.out.println(a+b);return a+b;}
	
	
}
