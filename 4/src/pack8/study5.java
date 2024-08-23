package pack8;
/*
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class study5 {
	public static void main(String[]args) {
			TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
			for(int i = 20; i>0; i-= 2) {
				treeMap.put(i, i+" 번째 데이터");
			}
		System.out.println(treeMap.toString());
		//1. firstKey()
		System.out.println(treeMap.firstKey());
		//2. firstEntry()
		System.out.println(treeMap.firstEntry());
		//3. lastKey()
		System.out.println(treeMap.lastKey());
		//4. lastEntry()
		System.out.println(treeMap.lastEntry());
		//5. lowerKey()
		System.out.println(treeMap.lowerKey(11));
		System.out.println(treeMap.lowerKey(10));
		//6. higherKey(K key)
		System.out.println(treeMap.higherKey(11));
		System.out.println(treeMap.higherKey(10));
		//7. pollFirsrtEntry()
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap.toString());
		//8. pollLastEntry()
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap.toString());
		//9. SortedMap<K, V> headMap(K toKey)
		SortedMap<Integer, String> sortedMap = treeMap.headMap(8);
		System.out.println(sortedMap);
		//10. NavigableMap(K, V) headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> navigableMap = treeMap.headMap(8, true);
		System.out.println(navigableMap);
		//11. SortedMap(K, V> tailMap(K toKey)
		sortedMap = treeMap.tailMap(14);
		System.out.println(sortedMap);
		//12. NavigableMap<K,V) headMap(K toKey, boolean inclusive)
		navigableMap = treeMap.tailMap(14, false);
		System.out.println(navigableMap);
		//13. SortedMap(K, V) subMap(K from, K toKey)
		sortedMap = treeMap.subMap(6,  10);
		System.out.println(sortedMap);
		// 14. NavigableMap(K,V) subMap(K toKey, boolean inclusive)
		navigableMap = treeMap.subMap(6, false, 10, true);
		System.out.println(navigableMap);
		//15. NavigableSet<K> descendingkeySet()
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
		System.out.println(navigableSet.toString());
		System.out.println(navigableSet.descendingSet());
		//16. NavigableMap = treeMap.descendingMap();
		System.out.println(navigableMap.toString());
		System.out.println(navigableMap.descendingMap());
		
		
	}
}

*/




//TreeMap: Map<K,v> 인터페이스를 구현한 구현 클래스
//맵의 기본기능 + 정렬
//엔트리(k,v) 집합의 형태로 관리하며 저장공간을 동적관리
//입력 순서와 관계없이 Key 갑의 크기순으로 출력(Key 값은 대소 비교가 가능해야 한다.)