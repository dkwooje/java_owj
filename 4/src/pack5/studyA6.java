package pack5;
/*
class DataBox {
	boolean isEmpty = true;
	int data;
	synchronized void inputData(int data) {
		if(!isEmpty) {
			try { wait(); } catch (InterruptedException e) {} //WAITING
		}
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터 : " + data);
		notify();
	}
	synchronized void outputData() {
		if(isEmpty) {
			try { wait(); } catch (InterruptedException e) {} //WAITING
		}
		isEmpty = true;
		System.out.println("출력 데이터: " + data);
		notify();
	}
}

public class studyA6 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for( int i = 1; i<9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i =1; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
		
	}
}
*/




//1: 쓰기 쓰레드 동작(데이터출력)
//2: 읽기 쓰레드 꺠우기(notify())
//3: 쓰기 쓰레드 일시정지(wait())
//4: 읽기 쓰레드 동작(데이터읽기)
//5: 쓰기 쓰레드 꺠우기(notify())
//6: 읽기 쓰레드 일시정지(wait())
//반복





