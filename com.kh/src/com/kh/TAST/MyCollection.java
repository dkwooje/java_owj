package com.kh.TAST;

import java.util.ArrayList;
import com.kh.test.model.vo.Animal;


public class MyCollection {

	public void test() {
		ArrayList<Animal> list = new ArrayList<Animal>();
	
		list.add("강아지 , 포유류");
		list.add("비둘기 , 조류");
		list.add("카멜레온 , 파충류");
	
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

