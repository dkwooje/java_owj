package pack6;
/*
class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class study2 {

	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
		//MyClass<Integer> mc3 = new MyClass<>();
		//mc3.set(안녕);  //상한 타입 체크로 문법 오류 발행
	}
}


*/
//Generic 클래스/인터페이스 정의 문법 구조
//접근지정자 class 클래스명 <T> {//타입 T를 사용한 코드}
//접근지정자 interface 클래스명 <T> {//타입 T를 사용한 코드}
//문법 : 클래스명<실제제네릭타입> 참조변수명 = new 클래스명<실제제네릭타입>(); 
//또는 클래스명<실제제네릭타입> 참조변수명 = new 클래스명<>(); (생성자의 경우 내부의 타입 생략 가능)
//객체생성시 제네릭타입을 지정하지 않으면 올 수 있는 Type중 최상위 클래스(Object)로 인식