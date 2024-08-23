package pack1;

public class studyA4 {

	public static void main(String[] args) {
		
		
		int a=3, b=3, c=3;   //논리연산자(&&, ||, !, ^)
		System.out.println(false && a++>6);
		System.out.println(true || b++>6);
		System.out.println(true ^ c++>6);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		int d=3, e=3, f=3;   // 비트연산자(&, |, ~ ,^)
		System.out.println(false & d++>6);
		System.out.println(true | e++>6);
		System.out.println(true ^ f++>6);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println();
//		비트연산자의 XOR(^)와 논리연산의 XOR은 모두 '^'의 기호를 사용함.
// 		논리연산자는 앞의 값(true)에 따라 뒤의 값의 계산을 수행하지만 
 //     비트연산자는 앞의 값에 상관 없이 수행한다.	
	}

}
