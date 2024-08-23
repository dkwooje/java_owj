package pack7;
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class study5 {
	public static void main(String[] arge){
		LinkedList <Integer> L1 = new LinkedList <Integer>();
		//1. add(E element)
		L1.add(3);
		L1.add(4);
		L1.add(3);
		System.out.println(L1.toString());
		
		//2. add(int index, E element)
		L1.add(1,6);
		System.out.println(L1.toString());
		
		//3. addAll(또 다른 리스트 객체)
		LinkedList<Integer> L2 = new LinkedList<>();
		L2.add(1);
		L2.add(2);
		L2.addAll(L1);
		System.out.println(L2);
		
		//4. addAll(int index, 또 다른 리스트 객체)
		LinkedList<Integer> L3 = new LinkedList<>();
		L3.add(1);
		L3.add(2); 			// [1 2]
		L3.addAll(1, L3);
		System.out.println(L3);
		
		//5. set(int index, E element)
		L3.set(1, 5);
		L3.set(3, 6);
	//	aList3.set(4, 7);			//java.lang.IndexOutOfBoundsException: //추가 못함
		System.out.println(L3);
		
		//6. remove(int index)
		L3.remove(1); 		//1번 인덱스를 삭제
		System.out.println(L3);
		
		// 7. remove(Object o)
		L3.remove(new Integer(6));
		System.out.println(L3);
		
		//8. clear()
		L3.clear();
		System.out.println(L3);
		
		//9. isEmpty()
		System.out.println(L3.isEmpty());
		
		// 10. size
		System.out.println(L3.size());
		L3.add(1);
		L3.add(2);
		L3.add(3);
		L3.add(4);
		L3.add(5);
		L3.add(6);
		System.out.println(L3);
		System.out.println(L3.size());
		
		//11. get(int index)
		System.out.println("0번째: " + L3.get(0));
		System.out.println("1번째: " + L3.get(1));
		System.out.println("2번째: " + L3.get(2));
		for(int i = 0; i< L3.size(); i++)
			System.out.println(i + "번째: " + L3.get(i));
		
		//12. toArray() List -> Array
		Object[] object = L3.toArray();
		System.out.println(Arrays.toString(object));
		
		// 13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = L3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		//13-2. toArray(T[] t) -> T[]
		Integer[] integer2 = L3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}
}

*/

//LinkedList 
//ArrayList<E>와의 공통점: 1.동일한 타입의 객체 수집 2.메모리 동적할당 3.데이터 추가,변경삭제 등의 메서드
//차이점:1.디폴트 저장공간(10)만 사용하여 생성자로 저장공잔의 크기지정불가. 2.데이터 내부 저장방식이 index가 아닌 앞뒤 객체의 위치 정보를 저장


