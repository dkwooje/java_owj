package pack1;

public class studyA7 {
	public static void main(String[]args) {
		
		
	
		
//		삼항연산자
		int a=(3>5)? 6:9;
		System.out.println(a);
		
		int b=(5>3)? 10:20;
		System.out.println(b);
		
		int c=3;
		System.out.println((c % 2 ==0) ? "짝수" : "홀수");
		
		
		// 삼항연산자를 if-else 구문으로 변환
		if(c%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}	
}
		
		
	}

