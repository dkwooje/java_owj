package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �� �Է� : ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		if((first >= 1 && first <= 9) && (second >= 1 && second <= 9)){
			int result = first * second;
			if(result >= 1 && result <= 9)
				System.out.println("���ڸ� �� �Դϴ�.");
			if(result >= 10 && result <= 99)
				System.out.println("���ڸ� �� �Դϴ�.");
		}

	}

}
