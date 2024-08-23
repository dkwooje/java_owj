package packA1;
/*
import java.io.File;

public class study2 {

	public static void main(String[] args) {
	//C 드라이브 내에 temp 폴더가 없을 때 생성
		File tempDir = new File("C:/temp");
		if(!tempDir.exists())
			tempDir.mkdir();
		
		//1. 파일 객체 생성
		File file = new File("C:/Windows");
		
		//2. 파일 메서드
		System.out.println("절대 경로: " + file.getAbsolutePath());
		System.out.println("폴더(?): " + file.isDirectory());
		System.out.println("파일(?): " + file.isFile());
		System.out.println("파일/폴더명: "+ file.getName()); //파일 또는 폴더이름
		System.out.println("부모 폴더: " + file.getParent());
		File newfile1 = new File("C:/temp/abc");
		System.out.println(newfile1.mkdir()); //true : 이미 폴더가 있는 경우 false
		File newfile2 = new File("C:/temp/bcd/cde");
		System.out.println(newfile2.mkdir()); // false
		System.out.println(newfile2.mkdirs());//true : 이미 폴더가 있는 경우 false
		File[] fnames = file.listFiles();
		for(File fname: fnames) {
			System.out.println( (fname.isDirectory()? "폴더: ":"파일: ")+
			fname.getName());
		}
	}
}
*/
//File 클래스의 주요 메서드
//String getAbsolutePath():파일의 절대 경로를 문자열로 리턴
//boolean isDirectory(): 폴더 여부를 참/거짓으로 리턴
//boolean isFile(): 파일 여부를 참/거짓으로 리턴
//String getName(): 파일의 이름을 문자열로 리턴
//String getParent(): 



