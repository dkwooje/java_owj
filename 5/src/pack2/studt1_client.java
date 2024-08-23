package pack2;
/*
import java.io.*;
import java.net.*;


public class studt1_client {
	public static void main(String[] args) {

		try {
			Socket s = new Socket("localhost", 3333); //localhost
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
			String str = "", str2 = "";
			while(!str.equals("stop")) {
				str = br.readLine();
				dout.writeUTF(str);;
				dout.flush();
				str2=din.readUTF();
				System.out.println("Server says: "+ str2);
			}
		} catch(Exception e) {System.out.println(e);}
	}
}
*/