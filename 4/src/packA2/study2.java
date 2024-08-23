package packA2;
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;

public class study2 {
	public static void main(String[] args) {
		
		//파일객체 생성
		File readerWriterFile = new File("src/BufferdeFile.txt");
		
		//1. FileWiter를 이용한 파일 쓰기 (UTF-8 모드)
		try(Writer writer = new FileWriter(readerWriterFile);
			BufferedWriter bw = new BufferedWriter(writer);) {
				bw.write("안녕하세요\n".toCharArray());
				bw.write("Hello");
				bw.write("\r");
				bw.write("\n");
				bw.write("반갑습니다.", 1, 4);
				bw.flush();
			} catch(IOException e) {}
			
			//2. FileReader를 이용한 파일 읽기(UTF-8 모드)
			try(Reader reader = new FileReader(readerWriterFile);
				BufferedReader br = new BufferedReader(reader);) {
				String data;
				while((data=br.readLine()) != null) {
					System.out.println(data);
				}
			} catch(IOException e) {}
	}
}


*/

//BufferedReader BufferedWriter 입출력과정에서 메모리 버퍼를 사용함으로써 속도 향상



