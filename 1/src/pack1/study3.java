package pack1;

public class study3 {
	
	public static void main(String[] args) {
		
	
	char value1 = 'A'; //"" ''내의 문자는 자동으로 문자로 인식된다.
	char value2 = '가';
	char value3 = '3';
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println();
	
	char value4 = 65;  //"" ''가 없는 숫자로 char 함수로 출력되면 유니코드로 변환된다.
	char value5 = 0xac00;
	char value6 = 51;
	System.out.println(value4);
	System.out.println(value5);
	System.out.println(value6);
	System.out.println();
	
	char value7 = '\u0041'; // u는 유니코드 정수를 문자로 변환한다.
	char value8 = '\uac00';
	char value9 = '\u0033';
	System.out.println(value7);
	System.out.println(value8);
	System.out.println(value9);
	System.out.println();
	
	
	
	}
}
