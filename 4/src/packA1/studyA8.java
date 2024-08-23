package packA1;
/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.OutputStream;

public class studyA8 {
	public static void main(String[] args)  throws FileNotFoundException, IOException{
	
		//File 객체 생성
		File outFile1 = new File("src/Print-Stream11.txt");
		File outFile2 = new File("src/Print-Stream22.txt");
		
		//1. PrintStream(FileOutStream(File))
		try(OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);){
			ps.println(5.8);
			ps.print(3+ "안녕"+ 12345 + "\n");
			//2. PrintStream(File)
			try(PrintStream ps2 = new PrintStream(outFile2);) {
				ps2.println(5.8);
				ps2.print(3+ " 안녕" + 12345 + "\n");
				ps2.printf("%d", 7).printf("%s %f", "안녕", 5.8); //chain 형식
				ps2.println();
			} catch(IOException e) {}
		
			//3. PrintStream ps = System.out
			try(PrintStream os2 = System.out;
			    PrintStream ps3 = new PrintStream(os2)) {
				ps3.println(5.8);
				ps3.print(3+ " 안녕" + 12345 + "\n");
				ps3.printf("%d, 7").printf("%s %f", "안녕", 5.8);
				ps3.println();
			} catch(IOException e) {}
			
			
			ps.println();
		} catch(IOException e) {}
}
		
		
	}

*/

//PrintStream : 다양한 타입의 출력에 특화된 클래스 자동 flush()기능 제공(flush() 필요없음) System.out의 객체 타입