package pack1;
/*
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

   public class studyA2_clientB {
       public static void main(String[] args) {
    	   
  System.out.println("<<ClientB>> - Text");
   // 1.DatagramSocket 객체 생성 (binding)
   DatagramSocket ds = null;
    try {
    ds = new DatagramSocket(20002);
    } catch (SocketException e) { e.printStackTrace();}
    
    // 2. 데이터그램패킷 수신
    byte[] receivedData = new byte[65508];
    DatagramPacket receivedPacket = 
    		new DatagramPacket(receivedData, receivedData.length);
    try {
    	ds.receive(receivedPacket);
    	} catch (IOException e) { e.printStackTrace();}
    	System.out.println("수신 데이터 : "+ new String(receivedPacket.getData(), 0, receivedPacket.getLength()));
    	
    	// 3. 전송데이터 생성 + DatagramPacket 생성
    	byte[] sendData = "반갑습니다.".getBytes();
    	DatagramPacket sendPacket = new DatagramPacket(sendData, 
    			sendData.length, receivedPacket.getSocketAddress());
    	
    	// 4. 데이터그램패킷 전송
    	System.out.println("송신 데이터 : "+ new String(sendPacket.getData(), 0, sendPacket.getLength()));
    	try {
    		ds.send(sendPacket);
    	} catch (IOException e) {e.printStackTrace();}
   }
}
*/