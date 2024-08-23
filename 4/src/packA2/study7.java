package packA2;
/*
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class study7 {
	public static void main(String[] args)  throws IOException {
		
		//파일 객체 생성
		File printWriter1 = new File("src/printWritet1.txt");
		File printWriter2 = new File("src/printWritet2.txt");
		File printWriter3 = new File("src/printWritet3.txt");
		
		//1. PrintWriter(File file)
		try(PrintWriter pw = new PrintWriter(printWriter1);) {
			pw.println("PrintWriter 예제#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요!");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch(IOException e) {}
		
		//2. PrintWriter(OutputStream os)
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(printWriter2));) {
			pw.println("PrintWriter 예제#2");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요!");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch(IOException e) {}
		
		//3. PrintWriter(OutputStream w)
		try(PrintWriter pw = new PrintWriter(new FileWriter(printWriter3));) {
			pw.println("PrintWriter 예제#3");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요!");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch(IOException e) {}
		
		//4.PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);  //자동 flash 설정
		pw.println("PrintWriter 예제#4");
		pw.println(13);
		pw.println(5.8);
		pw.print("안녕하세요!");
		pw.println("반갑습니다.");
		pw.printf("%d", 7).printf("%s %f", "감사", 3.7); 
	}
}
*/
//PrintWriter : PrintetStream과 같이 다양한 타입의 출력에 특화된 클래스
//자동 flush()기능 제공(autoflush = true) 또는 자원 반납시 autoflush 됨