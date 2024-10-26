package pack8;
/*
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;


class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			this.data = ((B)obj).data;
			return true;
		}
			return false;
	}
}

class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			this.data = ((C)obj).data;
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
}

public class study2 {
	public static void main(String[] args) {
		//1. 어떤 것도 오버라이딩하지 않음
		
		Map<A, String> M1 = new HashMap<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2); //두 객체는 메모리상 다른 공간에 있기 때문에 다르다.
		System.out.println(a1.equals(a2));//두 객체는 데이터 값이 다르다.
		System.out.println(a1.hashCode() + ", " + a2.hashCode()); //두 해쉬코드는 다르다.
		M1.put(a1, "첫 번쨰");
		M1.put(a2, "두 번쨰");
		System.out.println(M1.size()); //두 객체는 다르다.
		System.out.println();
		
		//2.equals() 메서드만 오버라이딩
		Map<B, String> M2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);//두 객체는 메모리상 다른 공간에 있기 때문에 다르다.
		System.out.println(b1.equals(b2)); //두 객체는 데이터(data) 값이 같다.
		System.out.println(b1.hashCode() + ", " + b2.hashCode()); // 두 해쉬코드는 다르다.
		M2.put(b1, "첫 번쨰");
		M2.put(b2, "두 번쨰");
		System.out.println(M2.size()); // 두 객체는 다르다.
		System.out.println();
		
		//3. equals()+ hashCode() 메서드 오버라이딩
		Map<C,String> M3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2); //두 객체는 메모리상 다른 공간에 있기 때문에 다르다.
		System.out.println(c1.equals(c2));//두 객체는 데이터(data) 값이 같다.
		System.out.println(c1.hashCode()+ ", " + c2.hashCode());// 두 해쉬코드는 같다.
		M3.put(c1,"첫 번쨰");
		M3.put(c2,"두 번쨰");
		System.out.println(M3.size());  // 두 객체는 같다.
	}
}
*/