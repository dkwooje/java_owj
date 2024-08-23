package pack7;
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class study4 {
	public static void main(String[] arge){

		Vector<Integer> v1 = new Vector<>();
		
			v1.add(3);
			v1.add(4);
			v1.add(3);
			System.out.println(v1.toString());
			//2. add(int index, E element)
			v1.add(1,6);
			System.out.println(v1.toString());
			
			//3. addAll(또 다른 리스트 객체)
			Vector<Integer> v2 = new Vector<>();
			v2.add(1);
			v2.add(2);
			v2.addAll(v1);
			System.out.println(v2);
			
			//4. addAll(int index, 또 다른 리스트 객체)
			Vector<Integer> v3 = new Vector<>();
			v3.add(1);
			v3.add(2); 			// [1 2]
			v3.addAll(1, v3);
			System.out.println(v3);
			
			//5. set(int index, E element)
			v3.set(1, 5);
			v3.set(3, 6);
		//	aList3.set(4, 7);			//java.lang.IndexOutOfBoundsException: //추가 못함
			System.out.println(v3);
			
			//6. remove(int index)
			v3.remove(1); 		//1번 인덱스를 삭제
			System.out.println(v3);
			
			// 7. remove(Object o)
			v3.remove(new Integer(6));
			System.out.println(v3);
			
			//8. clear()
			v3.clear();
			System.out.println(v3);
			
			//9. isEmpty()
			System.out.println(v3.isEmpty());
			
			// 10. size
			System.out.println(v3.size());
			v3.add(1);
			v3.add(2);
			v3.add(3);
			v3.add(4);
			v3.add(5);
			v3.add(6);
			System.out.println(v3);
			System.out.println(v3.size());
			
			//11. get(int index)
			System.out.println("0번째: " + v3.get(0));
			System.out.println("1번째: " + v3.get(1));
			System.out.println("2번째: " + v3.get(2));
			for(int i = 0; i< v3.size(); i++)
				System.out.println(i + "번째: " + v3.get(i));
			
			//12. toArray() List -> Array
			Object[] object = v3.toArray();
			System.out.println(Arrays.toString(object));
			
			// 13-1. toArray(T[] t) -> T[]
			Integer[] integer1 = v3.toArray(new Integer[0]);
			System.out.println(Arrays.toString(integer1));
			
			//13-2. toArray(T[] t) -> T[]
			Integer[] integer2 = v3.toArray(new Integer[5]);
			System.out.println(Arrays.toString(integer2));
			
	}
}
*/
//vector : ArrayList<E>와의 공통점: 1.동일한 타입의 객체 수집 2.메모리의 동적할당 3.데이터의 추가, 변경, 삭제 등의 메서드
// ArrayList<E>와의 차이점: 모든 메서드가 동기화 메서드로 구현되어 멀티쓰레드에 적합


