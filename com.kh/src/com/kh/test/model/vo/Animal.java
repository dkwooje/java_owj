package com.kh.test.model.vo;

import java.util.ArrayList;
import com.kh.test.model.vo.list;

public class Animal {

	public void test() {
		ArrayList<nimal> list = new ArrayList<nimal>();
	
		list.add("강아지 , 포유류");
		list.add("비둘기 , 조류");
		list.add("카멜레온 , 파충류");
	
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
