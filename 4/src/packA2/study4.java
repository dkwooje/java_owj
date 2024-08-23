package packA2;


import java.io.IOException;
import java.io.InputStreamReader;
public class study4 {
	public static void main(String[] args)  throws IOException {
			//콘솔로 입력(UTF-8)
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			int data;
			while((data = isr.read()) != '\r') {
					System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding());//어떤 형태로 인코딩 되었는지 확인
		} catch (IOException e) {}
		
		//콘솔로 입력 (MS949)
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println("\n" + isr.getEncoding()); 
		}catch (IOException e) {}
	}
}
//한글을 타이핑 해보자

