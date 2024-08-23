package packA1;

/*
import java.io.File;
import java.io.IOException;

public class study1 {
	public static void main(String[] args) throws IOException {
		
		//1-1. C 드라이브 내에 temp 폴더가 없을 때 생성
		File tempDir = new File("C:/temp");
		if(!tempDir.exists())
			tempDir.mkdir();
		System.out.println(tempDir.exists());
		
		//1-2 파일 객체 생성(실제 파일 생성)
		File newFile = new File("C:/temp/newFile.txt");
		if(!newFile.exists())
		newFile.createNewFile();              //temp 폴더가 없을 때 예외 발생
		System.out.println(newFile.exists());
		System.out.println();
		
		//2. 파일 구분자
		File newFile2 = new File("C:\\temp\\newFile.txt");
		File newFile3 = new File("C:/temp/newFile.txt");
		File newFile4 = new File("C:" + File.separator + "temp" + File.separator +"newFile.txt");
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		System.out.println();
		
		//3-1 절대경로
		File newFile5 = new File("C:/abc/newFile.txt");
		File newFile6 = new File("C:/abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());
		
		//3-2 상대 경로
		// 현재 위치
		System.out.println(System.getProperty("user.dir"));
		File newFile7 = new File("newFile1.txt");
		File newFile8 = new File("bcd/newFile2.txt");
		System.out.println(newFile7.getAbsolutePath());
		System.out.println(newFile8.getAbsolutePath());
		
		
	}
}

*/
//파일과 문자셋(Charset)
//파일 객체의 생성
//exists(파일, 폴더 존재여부 확인) createNewFile(파일생성) mkdir(폴더 생성)


//file의 구분자(separator): system 별 file 구분자 가져오기 => file의 정적 필드
//windows 파일 구분자: \\(원표시)
//mac 파일 구분자: /(일반슬래스)
//공통사용기능 : file.separator

//file의 절대경로 vs 상대경로
//file의 절대경로: 드라이브명(C: D:)로 부터 특정위치까지 절대적인 경로를 표기하는 방식
//file의 상대경로: 