package packA1;

/*

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class studyA7 {
	public static void main(String[] args)  throws IOException {
	
		//파일 생성
		File dataFile = new File("src/file2.data");
		//데이터 쓰기(DataOutputStream)
		try(OutputStream os = new FileOutputStream(dataFile);
				BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);){
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		}
		
		// 데이터 읽기(DataInputStream)
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());  //순서를 바꾸면 출력에 에러가 발생한다.
		//왜냐하면 읽어야할 데이터가 맞지않는 타입으로 읽혀져 끊겨 읽히기 때문 
		}
	}
}
*/


//향상된 속도로 다양한 타입의 입출력 수행
//Buffered + Data (IO) Stream 