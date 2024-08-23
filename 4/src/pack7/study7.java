package pack7;
/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class study7 {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>();
		
		//1.add (E element)
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");
		System.out.println(hSet1.toString());  //중복이 안됨
		
		//2. addAll(다른 set 객체)
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);   //왼쪽부터 첨가
		System.out.println(hSet2.toString()); 

		//3. remove(Object o)
		hSet2.remove("나");
		System.out.println(hSet2.toString());
		
		//4. clear()
		hSet2.clear();
		System.out.println(hSet2.toString());
		
		//5. isEmpty();
		System.out.println(hSet2.isEmpty());
		
		//6. contain(Object o)
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3.contains("나"));
		System.out.println(hSet3.contains("라"));
		
		//7. size()
		System.out.println(hSet3.size());
		
		//8. iterator()
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		//10-1. toArray(T[] t)
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		
		//10-2. toArray(T[] t)
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));	
	}
}

*/

//Set<E>: 집합의 개념으로 인덱스 정보를 포함하고 있지 않음.
//중복저장불가->인덱스 정보가 없기 때문에 중복된 원소 중 특정 위치 값을 꺼낼 방법이 없음

//HashSet<E> : Set<E> 인터페이스를 구현한 구현클래스
//수집한 원소를 집한의 형태로 관리하면 저장용량을 동적관리
//입력순서와 출력순서는 동일하지 않을 수 있음