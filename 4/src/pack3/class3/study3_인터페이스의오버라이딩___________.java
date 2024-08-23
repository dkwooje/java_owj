package pack3.class3;

interface A
{
	public abstract void abc();  
}
interface B
{
	void bcd();  //미완성
}
class C implements A
{
	public void abc() {}  //완성
}
class D implements B
{
	@Override
	public void bcd() {}
	// void bcd() {} // public을 빼면 default가 생략되어 표현되는데 default는 상속이 안된다. 
}
interface E extends A
{
	void abc();  //같은 인터페이스는 상속 받을 때 extends를 사용하고 default 상속이 가능하다.
}


//추상클레스의 메서드는 public을 붙이지 않아도(defualt)라도 상속이 가능했지만
//인터페이스의 메서드는 defualt 메서드는 상속이 불가능하다.

public class study3_인터페이스의오버라이딩___________ {
	public static void main(String[] args) {
		
	}
}


//미완성 메서드와 완성메서드를 구분하는 것은 메서드의 내용이 아니라 중괄호{}의 여부이다.
