package packA1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class studyA2 {
	public static void main(String[] args) throws IOException{
			InputStream is = System.in;
			// n - byte 단위 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장)
			byte[] byteArray1 = new byte[100];
			int count1 = is.read(byteArray1);
			String str1 = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
			System.out.println(str1);
			//n-byte 단위 읽기(앞에서 length만큼 읽어 byte[] offset 위치에 넣기
			byte[]byteArray2 = new byte[9]; //offset + length
			int offset = 3;  //3글자 빈배열  
			int length = 6;  //6자리
			int count2 = is.read(byteArray2, offset, length);
			String str2 = new String(byteArray2, 0, offset + count2, Charset.forName("UTF-8"));
			System.out.println(str2);
			
		//한글작성
	}
}