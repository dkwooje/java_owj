package test.controller;

public class Test2 {
	public static void main(String[] args) {
		int i;
		int j ;
		int m ;
		for(j=2; j<=5;j++) {
			for(i=1; i<=9; i++) {	
			m= i*j;	
			System.out.printf("%d * %d = %d\n" ,j,i,m );
			}
		}
	}
}
