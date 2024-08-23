package pack2;

import java.util.Arrays;

public class study3_break_again {
	public static void main(String[] args) {
	
		//단일 반복문 탈출
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			break;
		}
		for(int i = 0; i<10 ; i++) {
			if(i==5) {
				break;   //바깥 for 까지 영향 간다.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		//다중 반복문 탈출
		//@ 1개의 반복문만 탈출할 때
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(j==3) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		//@ break + Label 문으로 다중 반복문 탈출
	POS1: for(int i = 0; i<5; i++) {
				for(int j =0; j<5; j++) {
					if(j==3) {
						break POS1;
					}
					System.out.println(i+", "+j);
				}
			}
		System.out.println();
		//@변숫값을 조정해 다중 반복문 탈출	
		for(int i = 0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					i=100;
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
	}
}