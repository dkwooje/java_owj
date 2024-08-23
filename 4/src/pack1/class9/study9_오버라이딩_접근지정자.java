package pack1.class9;

class A { 
	protected void abc() {}
}
class B1 extends A{
	public void abc() {}
}
class B2 extends A{
	protected void abc() {}
}
class B3 extends A{
		// void abc () {}  //default 접근 지정자 (좁아져서 불가능)
}
class B4 extends A {
		// private void abc() {} // private 접근 지정자(좁아져서 불가능)
}

public class study9_오버라이딩_접근지정자 {
	public static void main(String[] args) {
	}
}


// public > protected > defualt > private : 각 접근자의 범위(최소 class A이상으로 넓어야 한다.)
//고유 class의 범위는 축소될 수 없다.