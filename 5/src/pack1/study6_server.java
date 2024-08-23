package pack1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ServerSocket;

public class study6_server {
 public static void main(String[] args) {
	 
 System.out.println("<<Server>>");
 ServerSocket serverSocket = null;
 try {
  serverSocket = new ServerSocket(11110);
 } catch(IOException e) {
 System.out.println("해당 포틀를 열 수 없습니다.");
 System.exit(0);;
 }
 System.out.println("클라이언트의 접속을 기다립니다.");
 try {
	  Socket socket = serverSocket.accept();//여기서 대기 시작(listening)
	  System.out.println("Client 연결 수락");
	  System.out.println("접속 client 주소: " + socket.getInetAddress() + ":" +socket.getPort());
	  DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	  DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
	  String str = dis.readUTF();
	  System.out.println("client: "+str);
	  dos.writeUTF("어서오세요!");
	  dos.flush();
	  } catch (IOException e) {}
 	}
 }
//사용중인 포트 강제종료방법
//C:\Windows\System32 CMD 에서 (netstat -ano)치고, 사용중인 포트확인.
//taskkill /pid 지우고싶은 포트의 PID /F
