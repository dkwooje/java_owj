package pack5.class6;


//공유 객체
class MyData {
	int data = 3;
	public synchronized void plusData() {//메서드 동기화 //스레드 동기화는 멀티스레드 환경에서 여러 스레드가 하나의 공유자원에 동시에 접근하지 못하도록 막는것을 말합니다.
		int mydata = data;  //데어터 가져오기  //plusThrea1 
		try {Thread.sleep(2000);} catch (InterruptedException e) {} //plusThrea1이 여기서 빠진다. 2초후 plusThrea2가 진행된다.
		data = mydata + 4;  //plusThrea2
	}
}
//+1: 4 5 /+2: 5 7 /+3: 6 9 /+4: 7 11
//공유 객체를 사용하는 쓰레드
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
	System.out.println(getName() + "실행 결과:"+ myData.data);
	}
}

public class study6 {

	public static void main(String[] args) {
		//공유 객체 생성
		MyData myData = new MyData();
		
		//plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThrea1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {} //start()는 동시에 시작하지만 plusThrea1이 시작된 1초 후 plusThrea2가 시작된다/
		
		//plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}
}
//동기화 방법 종류: 메서드 동기화 , 블록동기화
//메서드 동기화:동시에 두 개의 thread가 동기화 메서드 사용불가
//블록 동기화: 동시에 두 개의 thread가 동기화 블록 사용불가
//메서드 동기화 문법 : 접근지정자 synchronized 리턴타입
//Synchronized 키워드는 여러개의 스레드가 한개의 자원을 사용하고자 할 때, 현재 데이터를 사용하고 있는 해당 스레드를 제외하고 나머지 스레드들은 데이터에 접근 할 수 없도록 막는 개념입니다.


