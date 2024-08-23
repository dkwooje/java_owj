package pack3;

import java.util.Arrays;

public class study6_array {
	public static void main(String[] args) {

		int[] array = new int[] {3,4,5,6,7};
		System.out.println(array.length); //배열 길이 구하기
		
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		System.out.println();
		
		for(int i = 0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
		for(int k: array) {  //0부터 배열까지  key:value
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array)); //배열 내용 출력 하기

	}
}
