package pack2;

import java.util.Arrays;

public class study1_if_switch_for {
	public static void main(String[] args) {
		//중복 제어문(if-if, switch-for, for-for) (밖깥쪽 연산부터 실행한다.)
		
		int value1 = 4; //6
		int value2 = 3;
		if(value1 > 5) {
			if(value2 <3) {   //1
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}
		else {
			System.out.println("실행3");
		}
		System.out.println();
		
		int value3 = 2; //1
		switch(value3) {
		case 1 :
			for(int k = 0; k<10; k++) {
				System.out.print(k + " ");
			}
			break;
		case 2 :
			for(int k = 10; k>0; k--) {
				System.out.print(k + " ");
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				System.out.println(i+ " "+ j);
				if(i==j) {
					System.out.println("i = j");
				}
			}
		}
}
}