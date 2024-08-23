package test.controller;

public class test4 {

	public static void main(String[] args) {
	
		int i, j, m, t, y, z;
		
		for(i=1; i<10; i++) {
			for(j=1; j<10 ; j++) {
				m = i+j;
				t = i-j;
				y = i*j;
				z = i/j;
				
				System.out.print(m+ " ");
				System.out.println();
				System.out.print(t+ " ");
				System.out.println();
				System.out.print(y+ " ");
				System.out.println();
				System.out.print(z+ " ");
				
			}
		}	
	}
}
