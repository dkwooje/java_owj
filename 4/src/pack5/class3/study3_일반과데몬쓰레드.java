package pack5.class3;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + ": "+(isDaemon() ? "데몬쓰레드" : "일반쓰레드")); //isDaemon()이 true이면 데몬쓰레드 false면 일반쓰레드
		for(int i=0;i<6;i++) {												//만약 필드 타입이 boolean일 경우, Getter는 get으로 시작하지 않고 is 로 시작하는 것이 관례
			System.out.println(getName() + ": "+ i + "초");  //setName과 연동. setName에서 string을 지정하면 getName은 그 string을 받아 쓴다.
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			
		}
	}
}
public class study3_일반과데몬쓰레드 {

	public static void main(String[] args) {
	
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);  //true:데몬쓰레드
		thread1.setName("thread1");
		thread1.start(); // run으로 바꿔보자
		
		try {Thread.sleep(3500);}catch(InterruptedException e) {}  
		System.out.println("main Thread 종료");  // 시작하고 주 3.5초 후 스레드 종료
		
		//Daemon 스레드: 일반스레드의 작업을 돕는 보조적인 역할의 스레드. 일반스레드가 없으면 주스레드를 돕는다.
		//주 스레드가 종료되면 데몬 스레드는 강제적으로 자동 종료. (데몬스레드는 보조적인 역할이기 때문)
		//일반 쓰레드는 주 스레드가 종료되도 계속 진행
	}
}


//JAVA로 Thread 관련 프로그래밍을 학습하다보면 start() 메서드와 run() 메서드를 보게되는데 두 메서드를 실행하게되면 Thread의 run() 메서드를 실행하게 된다. 
//다만 이 두 메서드의 동작방식을 제대로 이해하지 못하고 사용하면 프로그램이 원치않게 실행 될 수 있다. 이 두 메서드의 동작방식의 차이를 한번 살펴보자.

//https://kim-jong-hyun.tistory.com/101


//run(): 	Thread가 생성되지 않으며 그냥 run() 메서드만 실행된다. 싱글쓰레드로 동작한다. 일반쓰레드가 끝나고 메인쓰레드가 시작한다.
//start():  native 영역에서 새로운 Thread가 생성되며 Thread가 시작되면 run() 메서드가 실행된다.  멀티쓰레드로 동작한다. 일반과 메인쓰레드 동시에 시작한다.











//Thread 데몬 설정 (Thread 클래스의 인스턴스메서드)
//voud setDeamon(boolean on)
//on이 true인 경우 Deamon Thread, Default 값은 false:일반 쓰레드
//일반쓰레드는 다른쓰레드 종료여부와 상관없이 자신의 쓰레드가 종료되어야 프로세스 종료
//데몬쓰레드는 일반쓰레드(사용자쓰레드)가 모두 종료되면 작업이 완료되지 않았어도 함께 종료.
//Thread: 만든 파일(프로그램)->프로세스->cpu , 프로세스 내부에 스레드가 cpu와 연결하면서 작업한다.
//프로세스는 스레드를 담는 상자. 