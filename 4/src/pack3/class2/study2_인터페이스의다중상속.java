package pack3.class2;



 interface A{}
 interface B{}
 class C implements A{}
 class D implements A, B{}
 class E extends C implements A, B{}
 //class F  implements A, B extends D{}  //순서를 지켜야 한다.
 //class E extends C,D implements A, B{} //클래스는 다중상속 불가능
public class study2_인터페이스의다중상속 {
 public static void main(String[]args ) {
	 
   }
}



//인터페이스의 상속 :implements를 사용 (expends가 아님)
//인터페이스는 다중 상속이 가능하다.
//클래스는 다중상속 불가