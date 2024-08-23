package pack2;

import java.util.Arrays;

public class study4_continue {
	public static void main(String[] args) {
		
		// continue는 if 문을 제외한 가장 가까운 닫힌 중괄호로 대치되는 개념
		for(int i = 0; i<10; i++) {
			continue;
		// System.out.println(i+" "); //(unreachable code 오류 발생)
		}
		for(int i = 0; i<10; i++) {
			System.out.print(i+ " ");
			continue;
		}
		System.out.println();
		
		for(int y = 0; y<10; y++) {
			if(y==5) {			//5만 생략
			continue;
			}
			System.out.print(y + " ");
		}
		System.out.println();
		//다중 반복문에서 continue 사용
		for(int y = 0; y<5; y++) {
			for(int j = 0; j<5; j++) {
				if(j==3) {
					continue;                     //j=3일때만 생략
				}
				System.out.println(y+ ", "+j);
			}
		}
		System.out.println();
		
		POS1: for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j ==3) {
					continue POS1;                  //j=3일때 i값진행
				}
				System.out.println(i+ ", "+j);
			}
		}	
	}
}
