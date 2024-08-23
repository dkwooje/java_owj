package pack2;

import java.util.Scanner;

public class study1_5_for {

	public static void main(String[] args) {
		

		 //  for(초기식;조건식;증감식)
//			{
//					실행구문;
//			}
		// for는 반복문이라 조건이 맞으면 멈추는것이 아니라 계속 진행한다.

				int a;
				for(a=0; a< 3; a++) {
					System.out.print(a+" ");
				}
				System.out.println();
				
				for (int i=0;i<3;i++){
					System.out.print(i+" ");	
				}
				System.out.println();
				
				for(int i=0;i<100;i++){
					System.out.print(i+" ");
				}
				System.out.println();
				
				for(int i = 10; i>0; i--) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				for(int i = 0; i < 10; i+=2) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				for(int i=0, j=0; i<10; i++, j++) {
					System.out.print(i + j + " ");
				}
				System.out.println();
				
			
				System.out.print("값을 입력하시오: ");
				Scanner e = new Scanner(System.in);
				int value = e.nextInt();
				int sum = 0;
				for(int c = 0; c<=value ; c++)
				{
					sum = sum + c;
					System.out.println(sum);
				}
				System.out.println();
				System.out.println(sum);


	}

}
