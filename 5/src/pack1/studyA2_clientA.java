package pack1;
/*
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class studyA2_clientA {
	public static void main(String[] args) {
		System.out.println("<<ClientA>> - Text");
		//1. DatagramSocket 객체 생성(binding)
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(10002);
		} catch (SocketException e) { e.printStackTrace();}
		
		//2. 전송데이터 생성 + DatagramPacket 생성
		byte[] sendData = "안녕하세요".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, new InetSocketAddress("localhost", 20002));
		
		// 3. 데이터그램 패킷 전송
		System.out.println("송신 데이터 : "+ new String(sendPacket.getData(), 0, sendPacket.getLength()));
		try {
			ds.send(sendPacket);
		} catch (IOException e) {e.printStackTrace();}
		
		//4. 데이터그램패킷 수신
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		try {
			ds.receive(receivedPacket);
		} catch (IOException e) { e.printStackTrace();}
		System.out.println("수신 데이터 : "+ new String(receivedPacket.getData(),0, receivedPacket.getLength()));	
	}
}
*/
