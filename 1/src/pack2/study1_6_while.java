package pack2;

import java.util.Scanner;

public class study1_6_while {

	public static void main(String[] args) {
		
		
//		while 문(조건식) ,초기식과 증감식은 외부로 
		
		System.out.print("계산 : ");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int sum=0;
		int z=1;
		while(z<=x)
		{
			sum=sum+z;
			z++;
		}
		System.out.println(sum);
	

	}

}
