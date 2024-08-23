package pack8;

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class study1 {
	public static void main(String[] args) {
		
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		
		//1. put (K key, V value)
		hMap1.put(2,"나다라");
		hMap1.put(1,"가나다");
		hMap1.put(3,"다라마");
		System.out.println(hMap1.toString());
		System.out.println();
		
		//2. putAll(다른 맵 객체)
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString());
		System.out.println();
		
		//3.replace(K key, V value)
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "라라라");
		System.out.println(hMap2.toString());
		System.out.println();
		
		//4.replace(K key, V oldValue, V newValue)
		hMap2.replace(1, "가가가","나나나");
		hMap2.replace(3, "라라라","마마마"); //  (3, "다라마","마마마") 바뀐다.
		System.out.println(hMap2.toString());
		System.out.println(hMap2.get(3));
		System.out.println(hMap2.containsKey(4));
		System.out.println();
		
		//5. V get(Object key)
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		System.out.println();
		
		//6. containsKey(Object key)
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		System.out.println();
		
		//7.containsValue(Object value)
		System.out.println(hMap2.containsValue("나나나"));
		System.out.println(hMap2.containsValue("다다다"));
		System.out.println();
		
		//8.Set<K> ketSet()
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet.toString());
		System.out.println();
		
		//9.Set<Map.Entry<K,v>> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet. toString());
		System.out.println();
		
		//10. size();
		System.out.println(hMap2.size());
		System.out.println();
		
		//11.remove(Object key)
		hMap2.remove(1);
		hMap2.remove(4);
		System.out.println(hMap2.toString());
		System.out.println();
		
		//12. remove(Object key, Object value)
		hMap2.remove(2, "나다라");
		hMap2.remove(3, "다다다");
		System.out.println(hMap2.toString());
		System.out.println();
		
		//13.clear()
		hMap2.clear();
		System.out.println(hMap2.toString());
		System.out.println();
		
	}
}

*/
// Map: Key와 Value 한 쌍으로 데이터를 저장
// Key는 중복저장 불가, Value는 중복 가능
// collection과는 별개의 interface임( list, set과 기본 메서드 다름)

//HAshMapL: Map<K,V> 인터페이스를 구현한 대표적인 구현 클래스
//:Key,Value의 쌍으로 데이터 관리하며 저장공간을 동적관리
//:입력의 순서와 출력의 순서는 동일하지 않을 수 있음(Key값이 Set으로 관리)