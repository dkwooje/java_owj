package pack1;

public class study2 {

	public static void main(String[] args) {
		
		
		float f1 = 1.0000001f;   //소수 7번째 자리까지 허용 (2의 8승을 양수와 음수로 쪼갠 숫자리)
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2);
		
		double d1 = 1.000000000000001;  //소수 15번째 자리까지 허용 (2의 16승을 양수와 음수로 쪼갠 숫자리)
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		System.out.println();
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		byte value1 = 127;  //-128~ 127 (2의 8승을 양수와 음수로 쪼갠것)
		short value2 =-32768 ; //-32769~ 32767(2의 16승을 양수와 음수로 쪼갠것)
		int value3 = -2147483648; //-2147483648~2147483647(2의 32승을 양수와 음수로 쪼갠것) 
		long value4 = -100L; //2의 64승을 양수와 음수로 쪼갠것 //long함수는 숫자 뒤에 L을 붙여준다.
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		float value5 = 1.2F;  //float 함수는 숫자 뒤에 F를 붙여준다.
		double value6 = -1.5;
		double value7 = 5;
		System.out.println(value5); System.out.println(value6);
		System.out.println(value7);
		
		float value8 = -1.5F;
		byte value9 = 100;
		System.out.println();
		
		char a = 'A';
		char b = 65;  //char함수의 숫자를 대입하면 자연스래 유니코드로 변환이 된다. 65는 대문자 A를 의미한다.
		char c = 0b1000001; //0b- 2진수를 의미한다.
		char d = 0x0041; //0x- 16진수를 의미한다.
		char e = '\u0041';  //   유니코드를 의미한다. 유니코드는 16진수와 동일하다.
		char f = 0101;  //0- 8진수를 의미한다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		
		

	}

}