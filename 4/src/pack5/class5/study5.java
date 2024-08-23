package pack5.class5;


class MyData {
	int data = 3;
	public void plusData() {  //no synchronized 비동기화
		int mydata = this.data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과: " + myData.data);
	}
}
public class study5 {

	public static void main(String[] args) {
			//공유 객체 생성
		MyData myData = new MyData();
		
		//plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThrea1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {} //1초 기다림
		
		//plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}

//동기화:작업 1이 끝날때 작업2가 시작하는것 (하나의 작업이 완전히 완료된 후 다른 작업 수행)
//비동기화: 작업1의 종료여부 상관없이 작업2가 시작하는것
//동기화의 필요성: 두 개의 Thread가 하나의 객체를 공유하는 경우





