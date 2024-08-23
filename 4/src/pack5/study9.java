package pack5;

 
  /*
 
public class study9 {

	public static void main(String[] args) {
		
		Thread.State state;
		
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i < 1000000000L ; i++) {} //시간 지연
			}
		};
		state = myThread.getState();
		System.out.println("myThread stat = " + state);
		
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}
}



*/








//thread 상태 
//thread.state:쓰레드 상태값 가져오기
//get thread

//new(만듬) runnable(실행대기,실행) terminated(종료)
//new를 통해 thread의 객체가 생성된 start()전
//runnable: start()이후 cpu를 사용할 수 있는 상태. 다른 thread들과 동시성에 따라 실행과 실행 대기를 교차
//terminated: run()메서드의 작업내용이 모두 완료되어  thread가 종료된 상태

//timed waiting(시간기약 있는 일시정지) blocked(동기화 일시정지) waiting(시간기약 없는 일시정지)