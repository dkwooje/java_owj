package pack1;
/*
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

	public class studyA3_ClientB {
		public static void main(String[] args) { 
	 
			System.out.println("<<ClientB>> - File"); 
			
			// 1. DatagramSocket 생성 (binding 포함)
			DatagramSocket ds = null;
			try {
				ds = new DatagramSocket(20001);
				ds.connect(new InetSocketAddress("localhost", 10001));
			} catch (SocketException e) { e.printStackTrace(); }
			
			// 2. 데이터그램 패킷 수신
			byte[] receivedData = null;
			DatagramPacket receivedPacket = null;
			
			// 2-1. 파일 이름 수신
			receivedData = new byte[65508];
			receivedPacket = new DatagramPacket(receivedData, receivedData.length); 
			try {
				ds.receive(receivedPacket);
			} catch (IOException e) { e.printStackTrace(); } 
			String fileName = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
			File file = new File("C:\\Users\\user1\\Desktop\\DATA\\CAT.jpg"+fileName);  
			BufferedOutputStream bos =null;
			try {
				bos = new BufferedOutputStream (new FileOutputStream(file));
			} catch (FileNotFoundException e) { e.printStackTrace(); }
			System.out.println("수신파일이름 : "+fileName);
			
			// 2-2. 시작태그와 끝태그를 기준으로 파일 수신
			String startSign = "/start";
			String endSign = "/end";
			receivedData = new byte[65508];
			receivedPacket = new DatagramPacket(receivedData, receivedData.length);
			try {
				ds.receive(receivedPacket);
				if(new String(receivedPacket.getData(), 0, receivedPacket.getLength()).equals(startSign)) {
					while(true) {
						ds.receive(receivedPacket);
						if(new String(receivedPacket.getData(), 0, receivedPacket.getLength()).equals(endSign)) 
							break; 
						bos.write(receivedPacket.getData(), 0, receivedPacket.getLength());
						bos.flush();
					}
				}
				bos.close();
			} catch (IOException e) { e.printStackTrace(); }
			// 4. 파일 전송 완료 메세지 응답
			byte[] sendData = "파일 수신 완료".getBytes(); 
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length); //수신지 정보 없음
			try {
				ds.send(sendPacket);
			} catch (IOException e) {e.printStackTrace(); }
	}
}
*/
 //받는 쪽(먼저 RUN)