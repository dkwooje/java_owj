package pack1;
/*
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class study9 {
	public static void main(String[] args) {
		
			//1. 데이터 생성
			//byte[] : 65536 bytes(64Kbytes) - 20byte(Ip 헤더) -8(UDP 헤더) =
			// 65508byte
		byte[] buf = "UDP - 데이터그램패킷".getBytes();
			//2. DatafreamPacket 객체 생성
			//2-1. 수신지 주소 미포함 패킷
				
		DatagramPacket dp1 = new DatagramPacket(buf, buf.length); //데이터를 상자에 담는 부분
		DatagramPacket dp2 = new DatagramPacket(buf, 4, buf.length-4);
		
		//2-2. 수신지 정보(IP, port) 포함 패킷
		DatagramPacket dp3= null;
		DatagramPacket dp4= null;
		try {
			dp3 = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 10000);
			dp4 = new DatagramPacket(buf, 4, buf.length-4, InetAddress.getByName("localhost"), 10000);
		}	catch (UnknownHostException e) { e.printStackTrace(); }
		
		//2-3. 수신지 정보(IPM Port) 포함 패킷
		DatagramPacket dp5 = new DatagramPacket(buf, buf.length, new InetSocketAddress("localhost", 10000));
		DatagramPacket dp6 = new DatagramPacket(buf, 4, buf.length-4, new InetSocketAddress("localhost", 10000));
		
		//3. DatagramPacket method
		System.out.println("원격지 IP : " + dp1.getAddress()); //null
		System.out.println("원격지 port : " + dp1.getPort());
		
		//System.out.println(dp1.getSocketAddress()); 
		//IllegalArgumentException 예외
		System.out.println("원격지 IP : " + dp3.getAddress()); 
		
		//localhost/127.0.0.1
		System.out.println("원격지 port : " +dp3.getPort());  //10000
		System.out.println("원격지 IP : " + dp3.getSocketAddress());
		
		//localhost/127.0.0.1 : 10000
		System.out.println();
		System.out.println("포함데이터 : " + new String(dp1.getData())); //만약 string으로 하지 않으면 아스키코드가 나온다.
		
		//UDP-데이터그램패킷
		System.out.println("포함데이터 : " + new String(dp2.getData()));
		
		//UDP-데이터그램패킷
		System.out.println("포함데이터 : " + new String(dp2.getData(), dp2.getOffset(), dp2.getLength()));
	
		//데이터그램패킷
		dp1.setData("안녕하세요".getBytes());
		System.out.println("포함데이터 : "+ new String(dp1.getData()));
		
	}
}
*/

//DatagramPacket : Data라는 택배를 보내기 위한 택배 상자 같은 개념.
//
//DataframSocket : Data라는 택배를 주고 받는 우편함 같은 개념.


