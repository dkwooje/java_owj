package pack5;

public class study5_객체와메서드 {
	public static void main(String[] args) {
		
		//같은 클래스 안에 있는 내부 메서드 호출 
		
		int a = twice(3);    
		
		System.out.println(a); 
		
		print();             
		
		double b = sum(a,5.8);    
		System.out.println(b);
	}
	public static void print() {   
		System.out.println("안녕");
	}
	public static int twice(int k) {  
		System.out.println(k);        
		 return k*2;                   
	}
	public static double sum(int m, double n) {  
 		return m+n ;
	}
}
