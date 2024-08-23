package pack1;
/*
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class study4 {
	public static void main(String[] args) throws IOException {

	//1. ServerSocket 객체 생성
		ServerSocket serverSocket1 = new ServerSocket(); //포트가 연결이 안됨
		ServerSocket serverSocket2 = new ServerSocket(20000);
		
	//2. ServerSocket 메서드
		//bind
		System.out.println(serverSocket1.isBound());  
		System.out.println(serverSocket2.isBound());
	//	InetAddress ia = InetAddress.getLocalHost(); //내 pc의 ip를 이용해 Inet Address 객체를 만듬
	//	InetSocketAddress isa = new InetSocketAddress(ia,10000);
	//	serverSocket1.bind(isa);
	//  System.out.println(serverSocket1.isBound());
		System.out.println();
		
		//serverSocket1.bind(new InetSocketAddress("127.0.0.1", 10000));
		serverSocket1.bind(new InetSocketAddress(InetAddress.getLocalHost(), 10000));
		System.out.println(serverSocket1.isBound());
		System.out.println(serverSocket2.isBound());
		System.out.println();
		
		//사용 중인 TCP 포트 확인하기
		for(int i=0; i<65536; i++) {
			try {
				ServerSocket serverSocket = new ServerSocket(i);
			} catch(IOException e) {
				System.out.println(i + "번째 포트 사용중....");
			}
		}
		System.out.println();
		// accept() 일반적으로는 별도의 쓰레드에서 실행
		// setSoTimeout(): accept() 대기시간
		serverSocket1 .setSoTimeout(10000);
		try {
			Socket socket = serverSocket1.accept(); //blocking		
		} catch(IOException e) {
			System.out.println(serverSocket1.getSoTimeout()+ " ms 시간이 지나 접속대기를 종료합니다.");
		}
	}
}
//ip지정 InetAddress
	//port지정 InetSorcketAddress
*/