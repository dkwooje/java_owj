package packA1;
/*
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class studyA5 {
	public static void main(String[] args) {
		
		//파일생성
		File V = new File("src/mycat_origin.jpg");
		File C_V1 = new File("src/mycat_copy1.jpg");		
		File C_V2 = new File("src/mycat_copy2.jpg");	
		long start, end, time1, time2;
		
		// 1. BufferedInputStream, BufferedOutputStream을 사용하지 않을 때
		
		// 시간 체크 시작
		start = System.nanoTime();  // 시작 시간을 재는거
		try(InputStream is = new FileInputStream(V);
			OutputStream os = new FileOutputStream(C_V1);) {
			//복사하는 코드
			int data;
			while((data = is.read()) != -1) {
				os.write(data); // 필터를 이용하지 않고 복사하는 것
			}
		} catch(IOException e) {e.printStackTrace();}
		end = System.nanoTime();  //끝나는 시간 재는것
		//시간체크 끝
		time1 = end - start; //time1에는 필터를 사용하지 않고 걸린 시간을 저장
		System.out.println("버퍼 없이(필터 없이) 파일을 복사하는데 걸린 시간: " + time1); 
		
		//2. BufferedInputStream, BufferedOutputStream을 사용했을 때
		
		//시간체크 시작
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(V);
			BufferedInputStream bis = new BufferedInputStream(is); //속도 증가를 위한 필터
			OutputStream os = new FileOutputStream(C_V2);
			BufferedOutputStream bos = new BufferedOutputStream(os);) { //속도 증가를 위한 필터
			//복사하는 코드
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);  //필터를 이용하지 않고 복사하는 것
			}
		}catch(IOException e) {e.printStackTrace();}
		end = System.nanoTime();
		//시간 체크 끝
		time2 = end-start; //time2는 버퍼를 씌운 입출력 시간 저장
		System.out.println("BufferedStream을 씌워서 파일을 복사하는데 걸린 시간: " + time2); 
		//사용했을 때와 사용하지 않았을 때 비교
		System.out.println("버퍼를 달고 안달고의 시간 차이의 비율: " + time1/time2 + "배의 속도 차이");				
	}
}

*/

//BufferedInputStream BufferedInputStream :입출력과정에서 메모리 버퍼를 사용함으로 속도 향상
//FilterInputStream FilterOutputStream: 원하는 방식으로 입출력