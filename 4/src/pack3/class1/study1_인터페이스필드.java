package pack3.class1;


interface A
{
	int a = 3;  //public static final이 생략되어있다.
	//public static final int a =3;  
	void abc();  //public abstract이 생략되어있다. 
	//public abstract void abc();
	
}
interface B
{

	public static final int b = 3;
	public abstract void bcd();
}

public class study1_인터페이스필드 {

	public static void main(String[] args) {
	System.out.println(A.a);
	System.out.println(B.b);
	
	//A.a =5; //final때문에 안됨
	//B.b =5; //final때문에 안됨
	
	}
}

//인터페이스: 모든 필드가 public static final로 정의
// 모든 메서드가 public abstract로 정의(디폴드메소드 제외)
//디폴트 메서드는 public로 정의
//자체적으로 객체생성 불가
