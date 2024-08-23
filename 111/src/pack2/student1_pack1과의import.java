package pack2;

import pack1.study1_public;
//import pack1.study2;
import pack1.study3_public클래스_default생성자;
import pack1.study4_public클래스_public생성자;


public class student1_pack1과의import {
	 public static void main(String[] args) {
		 
		 study1_public a = new study1_public(); //클래스와 연동o
	//	 study2 b = new study2();  //클래스와 연동 x
	//	 study3 c = new study3(); //클래스와 연동 o 하지만 생성자에서 거부(defualt) ,따라서 생성자의 내부는 캡슐화(+정보은닉)라고 할 수 있다.
		 study4_public클래스_public생성자 c = new study4_public클래스_public생성자();
	 }
}
//다른 패키지에서 public 클래스만 객체를 선언할 수 있다 
//default 생성자 호출 불가능