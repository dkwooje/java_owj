package pack5;

import java.util.Arrays;

public class study6_객체배열와메서드 {
	public static void main(String[] args) {
	
		int[] a = new int[] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3,4});
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
