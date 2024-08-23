package kh.model.vo;

import java.io.FileOutputStream;
import kh.model.vo.*;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class run<ObjectOutputString> {

	public void fileSave(String fileName) {
		try {
			 ObjectOutputString oss = new ObjectOutputString(new FileOutputStream(fileName);
			
			 oss.writeObject(new Student("s0001",98));
			}
			catch(Exception e) {}
	}
}
