package pack5;
/*
class MyThread1 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i< 10000000000000L ; i++) {}
	}
}

class MyThread2 extends Thread {
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- join(...) 진행 중 interrupt() 발생");
			for(long i = 0; i<1000000000000L ; i++) {}
		}
	}
}


public class studyA3 {
	public static void main(String[]args ) {
		//객체 생성
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		//TIMED_WAITING
		myThread2.interrupt();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
				
	}
}
*/