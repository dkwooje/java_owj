package pack2;

import java.util.Arrays;

public class study2_break {
	public static void main(String[] args) {
	
		//break는 if문을 제외한 가장 가까운 중괄호 탈출
		for(int i = 0; i<10; i++) {
			System.out.print(i);
			       //break; 
		}		                
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			if(i==5) {
				break; 
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(j==4)
					break;
				System.out.println(i+", " + j);
			}
		}
	}
}
