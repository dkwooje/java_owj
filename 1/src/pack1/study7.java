package pack1;

public class study7 {
	public static void main(String[] args) {
		
		int value1 = 3;
		int value2 = ++value1;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();
		
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7--  + ++value8;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		//증감연산자의 위치에 따라 값이 변하는것이 중요
	}
}