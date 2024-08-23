package pack1;

public class studyA1 {

	public static void main(String[] args) {
	
		System.out.println(3 << 1);
		System.out.println(-3 << 1);
		System.out.println(3 << 2);
		System.out.println(-3 << 2);
		System.out.println();
		
		System.out.println( 5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(5 >> 2);
		System.out.println(-5 >> 2);
		System.out.println();
		
		System.out.println(3 >>> 1);
		System.out.println(-3 >>> 31);
		System.out.println();
		
		System.out.println(5<<2);
		System.out.println(0b00000101<<2);
		System.out.println(5>>2);
		System.out.println(0b00000101>>2);
		System.out.println(-5>>2);
		System.out.println((byte)0b11111011>>2);
		System.out.println(0xffffffff>>31);
		
//		0b00111000 = 0x38  (2진수와 16진수와의 관계)
//		0b11110000 = 0xf0  (2진수의 4자리씩 끈어서 계산하면 16진수이다.)
//		0b11111111 = 0xff    
		
		
	}
}