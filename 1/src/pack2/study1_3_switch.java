package pack2;

import java.util.Scanner;

public class study1_3_switch {

	public static void main(String[] args) {
		
		System.out.print("점수 입력: ");
		Scanner r = new Scanner(System.in);
		int value4 = r.nextInt();
		switch (value4/10){
		case 10:
		case 9: 
			System.out.println("A학점"); break;
		case 8:	
			System.out.println("B학점"); break;
		case 7:
			System.out.println("C학점"); break;
		default:
			System.out.println("F학점");
		}
		
		
	}

}
