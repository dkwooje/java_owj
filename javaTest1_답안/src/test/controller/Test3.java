package test.controller;

public class Test3 {

	public static void main(String[] args) {
		double sum = 0.0, avg = 0.0;
		int n = 1;
		
		while(n <= 100){
			sum += n;
			n++;
		}
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (sum / 100));		
	}

}
