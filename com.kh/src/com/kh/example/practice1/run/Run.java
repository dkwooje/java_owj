package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.*;

public class Run {
	public static void main(String[] args) {
		member m = new member();
		m.changeName("이름입니다.");
		m.printName();
	}

}
