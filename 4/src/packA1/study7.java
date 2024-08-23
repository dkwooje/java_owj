package packA1;
/*
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class study7 {
	public static void main(String[] args) throws IOException{
		
		// 입력 파일 생성
		File outFile = new File("src/FileInputOutputStream1234.txt");
		
		//1. 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');
		os1.write('\n');
		os1.flush();  //파일에 밀어 넣음
		os1.close();  //파일 닫음
		
		//2. n-byte 단위 쓰기(byte[] 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true); //false 하면 덮어 쓰여진다.
		byte[] byteArray1 = "Hello!".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();

		//3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8); //7번 인덱스부터 8자리 선택
		os3.flush();
		os3.close();
	}
}
*/



//FileOutputStream: file에 byte 단위로 데이터를

//FileOutputStream 메서드 활용
//void write(int b), coid flush(), void close()