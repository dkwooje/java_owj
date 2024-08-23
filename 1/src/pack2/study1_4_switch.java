package pack2;

import java.util.Scanner;

public class study1_4_switch {

	public static void main(String[] args) {
	
		System.out.println("달: ");
		Scanner y = new Scanner(System.in);
		int value5 = y.nextInt();
		switch(value5) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("1일~31일"); break;
		case 4: case 6: case 9: case 11:
			System.out.println("1일~30일"); break;
		case 2:
			System.out.println("1일~28일"); break;
		default:
			System.out.println("알맞은 월자를 쓰시오.");
		}
	}

}
