package pack7;
/*
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class study9 {
	public static void main(String[] args) {
		
		Set<String> s1 = new LinkedHashSet<>();
		
		//1. add(E element)
		s1.add("가");
		s1.add("나");
		s1.add("가");
		System.out.println(s1.toString());
		
		//2. addAll(다른 set 객체)
		Set<String> s2 = new LinkedHashSet<>();
		s2.add("나");
		s2.add("다");
		s2.addAll(s1);
		System.out.println(s2.toString());
		
		//3. remove(Object o)
		s2.remove("나");
		System.out.println(s2.toString());
		
		//4. clear()
		s2.clear();
		System.out.println(s2.toString());
		
		//5. isEmpty();
		System.out.println(s2.isEmpty());
		
		//6. contains(Object o)
		Set<String> s3 = new LinkedHashSet<>();
		s3.add("가");
		s3.add("나");
		s3.add("다");
		System.out.println(s3.contains("나"));
		System.out.println(s3.contains("라"));
		
		//7. size()
		System.out.println(s3.size());
		
		//8. iterator()
		Iterator<String> iterator = s3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//9. toArray()
		Object[] objArray = s3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		//10-1 toArray(T[] t)
		String[] strArray1 = s3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		
		//10-2 toArray(T[] t)
		String[] strArray2 = s3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
	}
}

*/
//LinkedHashSet<E>: 입력순서와 출력 순서는 동일