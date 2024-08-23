package com.kh.practice.array.practice;

import java.util.Scanner;
import java.util.Arrays;

public class Arraypractice {

	private Scanner sc;
	public   Arraypractice(){
		sc = new Scanner(System.in);
	}
	public void practice1() {
		
		int[] arr = new int[10];
		for(int i=1; i<=arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}				
	}
	public void  practice2(){
		int[] arr = new int[10];
		for(int i=1; i<=arr.length; i++) {
			arr[i] = arr.length- i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}				
	}
	public void  practice3(){
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int k:arr) {
			System.out.print(k+ " ");
		}
	}
	public void  practice4(){
		String[] arr = new String[5];
		arr[0] ="사과";
		arr[1] ="귤";
		arr[2] ="포도";
		arr[3] ="복숭아";
		arr[4] ="참외";
		System.out.println(arr[1]);
	}
	public void  practice5(){
		System.out.print("문자열 : " );
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ch) {
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.print(ch+"의 개수 : " + cnt);
	}
	public void  practice6(){
		String[] arr = {"월","화","수","목","금","토","일"};
		System.out.print("0~6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>=0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void  practice7(){
		int[] arr = new int[sc.nextInt()];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d 번쨰 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		for(int k : arr) {
			System.out.printf("%d ", k);
			sum+=k;
		}
		System.out.printf("\n총 합 : &d", sum);
	}
	public void  practice8(){
			//생략
	}
	public void  practice9(){
		
		String[] chickens = {"양념","프라이드", "간장", "뿌링클"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.next();
		for(int i=0;i<chickens.length;i++ ) {
			if(str.equals(chickens[i])) {
				System.out.println(str+"치킨 배달 가능");
				return;
			}
		}
		System.out.println(str+"치킨은 없는 메뉴입니다.");	
	}
	public void  practice10(){
		System.out.print("주민등록번호 : ");
		String reg = sc.next();
		char[] arr = new char[reg.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = reg.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			if(i<=7){
			System.out.print(arr[i]);
			}
			else {
				System.out.print("*");
			}
		}
	}
	public void  practice11(){
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		for(int k : arr) {
			System.out.print(k+" ");
		}
	}
	public void  practice16(){
		char repeat = 'y';
		while(repeat == 'y') {
	System.out.print("배열의 크기를 입력하세요 : ");
	int size = sc.nextInt();
	String[] arr = new String[size];
	for(int i=0;i<arr.length;i++) {
		System.out.print(i+"번째 문자열 : ");
		arr[i] = sc.nextLine();
			}
		System.out.print(": 더 값을 입력하시겠습니까?(Y/N) : ");
		repeat = sc.next().charAt(0);
		}
	}
}
	
	
