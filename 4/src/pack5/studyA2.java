package pack5;
/*
class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(" -- sleep() 진행중 interrupt() 발생");
			for(long i = 0; i <1000000000L ; i++) {}
		}
	}
}

public class studyA2 {

	public static void main(String[] args) {
			MyThread myThread = new MyThread();
			myThread.start();
			
			try { Thread.sleep(100);} catch (InterruptedException e) {}
			System.out.println("MyThread State = " +myThread.getState());
			//TIMED_WAITING
			myThread.interrupt();
			try {Thread.sleep(100);}catch (InterruptedException e) {}
			System.out.println("MyThread State = " + myThread.getState());
	}
}



*/







//쓰레드의 상태 : 