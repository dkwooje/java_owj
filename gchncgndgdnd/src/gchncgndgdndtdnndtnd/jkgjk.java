package gchncgndgdndtdnndtnd;

import java.io.Serializable;

public class jkgjk implements Serializable{
	
	private String name;
	private int kcal;
	
		public Food() {}
		public Food(int a) {}
		
		public String getName() { return this.name;}
		public void setName(String name) {this.name = name;}
		public int getKcal() {return this.kcal;}
		public void setKcal(int kcal) {this.kcal = kcal;}
		
		@Override
		public String toString() {
			return name + " " +kcal;
		
	}
}

//캡슐화 필드 -> private
//getter/setter