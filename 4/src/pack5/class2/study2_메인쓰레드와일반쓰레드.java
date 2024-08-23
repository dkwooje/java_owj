package pack5.class2;

class MyThread extends Thread{
	@Override
	public void run() {
		for( long i = 0; i < 1000000000; i++) { } // 시간 지연용
			System.out.println(getName()+ " 우선순위:" +getPriority()); //우선순위 확인
		
	}
}
public class study2_메인쓰레드와일반쓰레드 {

	public static void main(String[] args) 
		{
 
		System.out.println("코어 수 :" + Runtime.getRuntime().availableProcessors()); //availableProcessors()는 JVM에서 이용가능한 코어 개수를 리턴한다.
		for(int i = 0; i<3 ; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		try {Thread.sleep(3000);} catch(InterruptedException e) {} //InterruptedException이 발생했다는 것은 스레드가 자신이 해야할 일을 정상적으로 완료하지 못했다는 뜻(쓰레드 종료)
		for(int i=0; i<10; i++) {          //sleep(초):초 동안 잠시 먼춘다.
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			if(i==9) { thread.setPriority(10);} //setPriority: 우선순위 지정
			thread.start();
		}
	
	//for(int i=0;i<1000;i++) {
//	MyThread th = new MyThread();
	//th.run();
//	}
		
		
	//int getPriority(): Thread 객체 우선순위 가져오기
	//Thread 객체 우선순위 정하기 (Thread 클래스의 인스턴메서드)
	//Runtime.getRuntime().availableProcessors() : 현재 시스템의 cpu코어수 가져오기
	//
		
		
	}
}
