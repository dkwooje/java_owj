package pack2.class6;


import java.util.HashMap;

class A {
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return name;
	}
}
class B {
	String name;
	B(String name){
		this.name =name;
	}
	@Override
	public boolean equals(Object obj) { //equals
		if(this.name == ((B)obj).name) {
			return true;
		}
		else 
			return false;
	}
	@Override
	public int hashCode() { //hashcode를 name의 해시값으로 바꾼다.
		return name.hashCode(); 
	}
	@Override
	public String toString() {
		return name;
	}
}

public class study66_HashMap_키와벨류 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>(); //해쉬맵의 객체생성
		hm1.put(1,  "데이터1"); //key값 중복 (출력 x) 
		hm1.put(1,  "데이터2"); //key값 중복 (출력 o)
		hm1.put(2,  "데이터3"); //나중에 들어간게 나중에 출력된다.
		System.out.println(hm1);
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫 번쨰"), " 데이터1"); //A는 hash코드가 없어서 name을 비교하는게 아닌 주소값을 비교하게된다. //key값이 Integer로 조정되었기 때문에 문자는 해쉬코드로 바뀐다.
		hm2.put(new A("첫 번쨰"), " 데이터2"); //주소값을 비교하게되어 중복이 가능하다.
		hm2.put(new A("두 번쨰"), " 데이터3"); //나중에 들어간게 먼저 출력된다.
		System.out.println(hm2);
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫 번쨰"), " 데이터1"); //중복이라 출력 x
		hm3.put(new B("첫 번쨰"), " 데이터2"); //hashcode를 name의 해시값으로 바꿔 같은 해시값(키값)을 가지게 된다.
		hm3.put(new B("두 번쨰"), " 데이터3");
		System.out.println(hm3);		
	}

}


//object 메서드 : hashcode()   KET VALUE
//HashMap: 중복되지 않는다. 같은 데이터를 배제한다.
//hashcode와 equals가 동일하면 같은 객체

//해시는 정보를 저장하거나 검색할 때 사용하는 자료 구조.
//   hashCode=index(저장위치)= hash(key)
