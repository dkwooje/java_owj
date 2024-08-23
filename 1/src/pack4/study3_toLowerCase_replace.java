package pack4;

import java.util.Arrays;

public class study3_toLowerCase_replace {

	public static void main(String[] args) {
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); //소문자 출력		
		System.out.println(str1.toUpperCase()); //대문자 출력		
		System.out.println(str1.replace("Study", "공부")); //앞의 문자를 뒤의 문자로 교체		
		System.out.println(str1.substring(0, 6)); //문자열 자르기
		System.out.println(str1); //결국 원본은 변하지 않는다.		
		System.out.println(); 
		
		
		String[] strArray = "abc/def-ghi jkl".split("/|-| "); //객체에 직접 메소드를 대입할 수 있다.
		System.out.println(Arrays.toString(strArray)); //split: 괄호 안의 객체를 기준으로 나눔(/,-,'공백'을 기준으로 나눔(|는 or란 뜻으로 객체가 아니다.))
		
		System.out.println("abc".trim()); //문자열 앞 뒤의 공백을 없앤다.
		System.out.println();
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("JAJA");
		
		System.out.println(str2 == str3); //문자열은 힙영역이 같아도 스택영역이 다르므로 ==를 쓸 수 없다.
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		System.out.println(str5 == str2);
		System.out.println();
		
		System.out.println(str2.equals(str3)); //equals: 실제 저장된 문자값으로 비교함. 대소문자마저 비교된다.
		System.out.println(str2.equals(str4));
		System.out.println(str2.equals(str5));
		System.out.println(str2.equalsIgnoreCase(str4));
		System.out.println(str2.equalsIgnoreCase(str5)); //equalsIgnoreCase: 대소무자의 구분은 무시하며 비교한다.
	}
}
