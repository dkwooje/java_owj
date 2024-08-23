package packA1;
/*
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class study8 {
	public static void main(String[] args) throws IOException{
		//1. 입력 파일 생성
		File outFile = new File("src/Fileinoutstudy1.txt");
		
		//2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true); //내용연결
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
		
		//3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true); //false
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset());
		os3.write(byteArray2, 6, 6); //한글은 한글자당 3바이트
		os3.flush();
		os3.close();
	}

}
*/


//한글:void write(byte[] b)