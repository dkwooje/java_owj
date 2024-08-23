package packA2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;
import java.io.FileReader;

public class study1 {
	public static void main(String[] args) {
		
		//파일 객체 생성
		File readerWriterFile = new File("src/Reader WriterFile.txt");
		
		//1. FileWriter를 이용한 파일쓰기(UTF - 8 모드)
		try(Writer writer = new FileWriter(readerWriterFile)) {
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.", 2, 3);
			writer.flush();		
		}	catch(IOException e) {}
		//2. FileReader를 이용한 파일 읽기(UTF-8 모드)
		try(Reader reader = new FileReader(readerWriterFile)) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
	}
}


//Reader , Writer 추상클래스
// 