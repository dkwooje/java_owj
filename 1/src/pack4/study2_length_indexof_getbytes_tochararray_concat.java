package pack4;

import java.util.Arrays;

public class study2_length_indexof_getbytes_tochararray_concat {

	public static void main(String[] args) {
		
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length()); //문자열 길이
		System.out.println(str2.length());
		System.out.println();
		
		System.out.println(str1.charAt(1)); //해당 문자
		System.out.println(str2.charAt(1));
		System.out.println();
		
		System.out.println(str1.indexOf('a')); //앞에서부터 처음 만나는 a 위치  {0 1 2 3 4 5 6 "7" }
		System.out.println(str1.lastIndexOf('a')); //뒤에서부터 처음 만나는 a 위치 {0 1 2 3 4 5 6 7 8 "9"}
		System.out.println(str1.indexOf('a',8)); //8번째 자리 문자에 가장 가까운 오른쪽 a 위치 {0 1 2 3 4 5 6 7 '8' "9"}
		System.out.println(str1.lastIndexOf('a',8)); //8번째 자리 문자에 가장 가까운 왼쪽 a 위치 {0 1 2 3 4 5 6 "7" '8' 9 10}
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye"));	//-1은 아무것도 못찾았다는 의미
		System.out.println(str2.lastIndexOf("고맙습니다."));
		System.out.println();
		
		String str3 = String.valueOf(2.3); //기본타입을 문자열로 변환시킴
		String str4 = String.valueOf(false); //기본타입을 문자열로 변환시킴
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str3.concat(str4); //텍스트 붙이기(+와 동일 기능)
		System.out.println(str5);
		
		String str6 = "안녕"+3+8+2;
		String str7 = "안녕".concat(String.valueOf(3))+8+2;
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		System.out.println();
		
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] array1 = str8.getBytes(); //이 문자열(String)을 주어진 charset을 사용하여 byte의 시퀀스로 인코딩하고, 새로운 byte 배열에 결과를 저장한다.
		byte[] array2 = str9.getBytes(); //쉽게말해 아스키코드로 바꿔준다.
		System.out.println(Arrays.toString(array1));//배열의 내용을 보여줌
		System.out.println(Arrays.toString(array2));//배열의 내용을 보여줌
		
		char[] array3 = str8.toCharArray();// 이 문자열을 새 '문자 배열'로 변환합니다.
		char[] array4 = str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
		
		
		
	}

}
