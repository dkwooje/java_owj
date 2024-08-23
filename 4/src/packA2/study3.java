package packA2;

/*
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class study3 {
	public static void main(String[] args) {
		//파일객체 생성
		File inputStreamReader = new File("src/Input-StreamReader.txt");
		
		//1. FileReader를 이용한 파일 읽기
		try(Reader reader = new FileReader(inputStreamReader)) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch(IOException e) {}
		System.out.println();
		
		//2. FileInputStream + InputStreamReader를 이용한 파일 읽기
		try(InputStream is = new FileInputStream(inputStreamReader);
			InputStreamReader isr = new InputStreamReader(is, "MS949");) {
			int data;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding()); //MS949
		} catch(IOException e) {}
	}
}
*/
//inputStreamReader OutputStreamWriter
//byte 단위 입출력 ->char단위 입출력으로 변환