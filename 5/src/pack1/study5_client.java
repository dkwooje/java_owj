package pack1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class study5_client {
	public static void main(String[] args) {
		System.out.println("<<Client>>");
		try {
			Socket socket = new Socket(InetAddress.getByName("localhost"),11110);//localhost
			System.out.println("Server에 접속 완료");
			System.out.println("접속 Server 주소: "+socket.getInetAddress()+":" +socket.getPort());
			DataInputStream dis = new DataInputStream( new BufferedInputStream(socket.getInputStream()));
			DataOutputStream dos = new DataOutputStream( new BufferedOutputStream(socket.getOutputStream()));
		dos.writeUTF("안녕하세요");
		dos.flush();
		String str = dis.readUTF(); //인터넷에서 확인
		System.out.println("server: " + str);
		}
		catch (UnknownHostException e) {}
		catch (IOException e) {e.printStackTrace();}
	}
}
//server먼저 run하고 client를 run해야한다. (server를 열고 client로 보낸다.)
