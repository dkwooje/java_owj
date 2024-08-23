package pack5;
/*
class MyData {
	synchronized void abc() {  //key = this
		for(int i = 0; i<3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	synchronized void bcd() {   //key = this
		for( int i = 0; i<3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	void cde() {
		synchronized(this) {    //key = this ,new Object()
			for (int i = 0; i<3 ; i++) {
				System.out.println(i + "번째" );
				try { Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
}
public class study8 {
	public static void main(String[]args ) {
		//공유 객체
		MyData myData = new MyData();
		//3개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
	}
}


*/










//동기화의 원리: 모든 객체는 단 한나의 열쇠를 가진다. 
//동기화를 사용하면 처음 사용하는 thread가 key객체의 key를 가진다.
//다른 thread는 먼저 사용중인 thread가 작업을 완료하고 key를 반납할 때 까지 대기
//동기화 메서드: 자기자신의 객체(this), 동기화블록: synchronized(key객체){}에서 사용한 key 객체

