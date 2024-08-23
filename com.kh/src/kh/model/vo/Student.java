package kh.model.vo;

import java.io.Serializable;

public class Student implements Serializable{
	
	private String studentCode;
	private int score;
	
		public Student(String string, int i) {}

		public String getstudentCode() { return this.studentCode;}
		public void setstudentCode(String studentCode) {this.studentCode = studentCode;}
		public int getscore() {return this.score;}
		public void setscore(int score) {this.score = score;}
		
		@Override
		public String toString() {
			return studentCode + " " +score;
		
	}
}

//캡슐화 필드 -> private
//getter/setter