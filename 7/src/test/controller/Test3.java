package test.controller;

public class Test3 {
	public static void main(String[] args) {

			int i =1;
			int sum = 0;
			int avg = 0;
			while(i<=100) {
				sum = sum+i;
				i++;
				avg = sum/i;
			}	System.out.println(sum); System.out.print(avg);
	}
}
