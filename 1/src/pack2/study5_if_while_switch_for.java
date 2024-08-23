package pack2;

public class study5_if_while_switch_for {
	public static void main(String[] args) {
		
		int score1 = 72;
		if (80<=score1&&score1<90) {
			System.out.println("B학점");
		}
		else if(90<=score1&&score1<=100) {
			System.out.println("A학점");
		}
		else if(70<=score1&&score1<=80) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		System.out.println();
		System.out.println();
		
		int q = 10;
		while(q>0) {
			System.out.println(q);
			q-=2;
		}
		System.out.println();
		System.out.println();
		
		int score2 =72;
		switch (score2/10) {
		case 8:
			System.out.println("B학점"); break;
		case 9: case 10:
			System.out.println("A학점"); break;
		case 7:
			System.out.println("C학점"); break;
		default:
			System.out.println("F학점");
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; ; i++) {
			if(i==11) {break;}
			if((i%2)==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println();
		
		for(int a=0; a<10; a++) {
			for(int b=0; b<5; b++) {
				if( a==3 && b==2) {
					a=100;
					break;
				}
				System.out.println(a+ ", "+b);
			}
		}
		System.out.println();
		System.out.println();
		
		ABC: for(int c=0; c<10; c++) {
			for(int d=0; d<5; d++) {
				if(c==3 && d==2) {
					break ABC;
				}
				System.out.println(c+ " , "+d);
			}
		}
	}
}
