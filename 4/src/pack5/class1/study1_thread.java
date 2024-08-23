package pack5.class1;

public class study1_thread {
		public static void main(String[] args) {
			
			Thread curThread = Thread.currentThread();
			System.out.println("현재 쓰레드의 이름 = " + curThread.getName());
			System.out.println("동작하는 쓰레드의 개수 =" + Thread.activeCount());
			for(int i = 0 ; i < 3 ; i++) {
				Thread thread = new Thread();
				System.out.println(thread.getName());  //이름을 알고싶다, 확인하고싶다면 (getname)
				thread.start();
			}
			for(int i=0;i<3;i++) {
				Thread thread = new Thread();
				thread.setName(i+"번쨰 쓰레드");  //이름을 설정할고싶다. (setname)
				System.out.println(thread.getName());
				thread.start();
			}	
	}
}
                      

//1) 프로세스란?
//프로세스(Process)는 일반적으로 cpu에 의해 메모리에 올려져 실행중인 프로그램을 말하며, 자신만의 메모리 공간을 포함한 독립적인 실행 환경을 가지고 있습니다.
//우리가 사용하는 프로그램 중 일부는 여러 프로세스간 상호작용을 하는 것일수도 있습니다. 
//자바 JVM(Java Virtual Machine)은 주로 하나의 프로세스로 실행되며, 동시에 여러 작업을 수행하기 위해서 멀티 스레드를 지원하고 있습니다.  

//2) 스레드란?
//스레드(Thread)는 프로세스안에서 실질적으로 작업을 실행하는 단위를 말하며, 자바에서는 JVM(Java Virtual Machine)에 의해 관리됩니다.
//프로세스에는 적어도 한개 이상의 스레드가 있으며, Main 스레드 하나로 시작하여 스레드를 추가 생성하게 되면 멀티 스레드 환경이 됩니다. 
//이러한 스레드들은 프로세스의 리소스를 공유하기 때문에 효율적이긴 하지만 잠재적인 문제점에 노출될 수도 있습니다. 
