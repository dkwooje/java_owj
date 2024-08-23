package pack4;

public class study4 {

	public static void main(String[] args) {
		
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다.";
		String name;
		int age;
		
				int start = str.indexOf("[");
				int end = str.indexOf("]");
				
				System.out.println(start+"//"+end);
					
				name =str.substring(start+1,end); //문자열에서 특정 문자열을 뽑아낼 때 사용
				start = str.lastIndexOf("[");
				end = str.lastIndexOf("]");
				
				System.out.println(name);
				
				age = Integer.parseInt(str.substring(start+1,end)); //age는 int이기 때문에 name처럼 하면 안된다. str은 문자이기 때문이다.
				
				System.out.println(age);
				
				// 클래스(class)의 기본 문법
				// 클래스 밖에 올수 있는 3가지 (1. package 2.import 3.external class)	
				// 클래스 안에 올 수 있는 4가지(1.필드 2.메서드 3. 생성자 4. 내부클래스
				// package: java 파일 폴더
				// import: 다른 폴더(패키지) 위치의 클래스를 참조
				// external class
				// 필드: 클래스 속성을 나타내는 변수 (int a = 3;)
				// 메서드: 클래스의 기능( double abc(){...} )
				// 생성자: 객체 생성기능 ( a(){...} )
				// 내부클래스
				
	}

}
