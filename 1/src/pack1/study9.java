package pack1;

public class study9 {
	public static void main(String[] args) {
		
		int data = 13;
		System.out.println(Integer.toString(data)); //정수를 문자로
		System.out.println(Integer.toBinaryString(data)); //정수를 2진수 문자로
		System.out.println(Integer.toOctalString(data));  //정수를 8진수로 문자로
		System.out.println(Integer.toHexString(data));  //정수를 16진수로 문자로
		System.out.println(Integer.toString(data) + Integer.toString(data));
		System.out.println(Integer.toBinaryString(data) + Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data) + Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data) + Integer.toOctalString(data)); 
		
		System.out.println();
		
		// Integer.parseInt: " " 안의 문자열을 숫자열로 바꾸고 ( ,수) 로 하여금 진법을 구분한다.
		System.out.println(Integer.parseInt("1101", 2));   // String타입의 숫자를 int타입으로 변환
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("0D", 16));
		System.out.println(Integer.parseInt("1101", 2) + Integer.parseInt("1101", 2));   
		System.out.println(Integer.parseInt("15", 8) + Integer.parseInt("15", 8) );
		System.out.println(Integer.parseInt("0D", 16) + Integer.parseInt("0D", 16) );
		System.out.println();
		
		System.out.println(13);
		System.out.println(0b1101); //2진수를 10진수로
		System.out.println(015);  //8진수를 10진수로
		System.out.println(0x0D); //16진수를 10진수로
		System.out.println();
		
		System.out.println(3 & 10);   //and 연산
		System.out.println(0b0011 & 0b1010);  
		System.out.println(0x03 | 0x0A);  //or 연산
		System.out.println();
		
		System.out.println(3^10); //xor 연산
		System.out.println(0x03 ^ 0x0A);
		System.out.println();
		
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		
/*		integer: 정수라는 뜻 (int)인티져
 		integer는 int의 래퍼 클래스
		toBinary: 2진법
		Octal: 8진법
		Hex: 16진법
		String: 묶다, 줄
		파싱(Parsing)은 의미를 알 수 없는 문자열을 분해, 분석하여 의미 있는 형태로 변환합니다. 
		이때 데이터를 분해, 분석하는 프로그램이 파서(parser)입니다.
		parse: (문장을 문법적으로)분석하다.
		 많은 분야에서 사용되며 하향식(Top-Down), 상향식(Bottom-Up) 파싱 기법이 있습니다. 
		Integer.valueOf:메서드는 문자열을 입력받고, 참조형인 new Integer(정수)로 변환합니다.
       parseInt()와 valueOf()의 차이점은 기본형으로 반환하냐, 참조형으로 반환하냐의 차이이며 다음과 같이 필요에 따라 사용하면 됩니다.
*/
		//&: and , |: or , ~: not , ^: xor
		
		
		
		
		
	}
}

