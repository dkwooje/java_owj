package pack4;

public class study1_String {
	public static void main(String[]args) {
		
		
		//String 참조자료형
		
			String str6 = "안녕하세요";
			System.out.println(str6);
		
			String str7 = new String("안녕");
			System.out.println(str7);
		//String 특징 1: 객체내의 값 변경 불가능. 특징2:리터럴(데이터(값))을 바로 입력한 데이터는 문자열이 같은 경우 하나의 객체를 공유
			
			String str1 = new String("안녕"); //뉴키워드
			String str2 = "안녕"; //리터럴
			String str3 = "안녕"; //리터럴
			String str4 = new String("안녕"); //뉴키워드
			
			System.out.println(str1 == str2);
			System.out.println(str2 == str3);
			System.out.println(str3 == str4);
			System.out.println(str1 == str4);
			System.out.println();
			System.out.println();
			System.out.println();
			
		//문자열 + 문자열 -> 문자열을 연결
		//문자열 + 기본자료형 -> 기본자료형을 문자열로 변환 + 문자열 연결
			
			String str8 = "안녕"+"하세요"+"!";
			System.out.println(str8);
			
			String str9="반갑";
			str9 += "습니다";
			str9 += "!";
			System.out.println(str9);
			System.out.println();
			
			String str10 = "안녕"+1;
			String str11 = "안녕"+ String.valueOf(7.6);
			String str12 = "안녕"+ "1";
			
			System.out.println(str10);
			System.out.println(str11);
			System.out.println(str12);
			System.out.println();
			
			System.out.println(1+"안녕");
			System.out.println(1+"안녕"+2);
			System.out.println("안녕"+1+2);
			System.out.println(1+2+"안녕");
/*문자열 형 변환의 종류로는 대표적으로 String.valueOf() 속성과 Object.toString() 두 가지 메서드가 존재합니다.

*/

	}
}
