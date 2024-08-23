package pack7;
/*
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class studyA1 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i = 50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet.toString());
		
		//1. first()
		System.out.println(treeSet.first());
		
		//2. last()
		System.out.println(treeSet.last());
		
		//3. lower(E element)
		System.out.println(treeSet.lower(26));
		
		//4. higher(E element)
		System.out.println(treeSet.higher(26));
		
		//5. floor(E element)
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		
		//6. ceiling(E element)
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		System.out.println();
		
		// 7. pollFirst()
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for(int i = 0; i< treeSetSize; i++) {
			System.out.print(treeSet.pollFirst() + " ");
		}
		System.out.println();
		System.out.println(treeSet.size());
		
		//8. pollLast()
		for(int i = 50; i>0 ; i-= 2) {
			treeSet.add(i);
		}
		treeSetSize = treeSet.size();
		for(int i = 0; i< treeSetSize; i++) {
			System.out.print(treeSet.pollLast()+ " ");
		}
		System.out.println();
		System.out.println(treeSet.size());
		
		//9. SortedSet<E> headSet(E element)
		for(int i = 50; i > 0; i-=2) {               //[2,4,6,....50]
			treeSet.add(i);
		}
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet.toString());
		
		//10. NavigableSet<e> headSet(E element, boolean inclusiv)
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet.toString());
		nSet = treeSet.headSet(20, false);
		System.out.println(nSet.toString());
		
		//11. SortedSet<E> tailSet(E element)
		sSet = treeSet.tailSet(20);
		System.out.println(sSet.toString());
		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive)
		nSet = treeSet.tailSet(20, true);
		System.out.println(nSet.toString());
		nSet = treeSet.tailSet(20, false);
		System.out.println(nSet.toString());
		
		//13. SortedSet<e> subSet(E element, E element)
		sSet= treeSet.subSet(10, 20);
		System.out.println(sSet.toString());
		
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean invlusive)
		nSet = treeSet.subSet(10, true, 20, false);
		System.out.println(nSet.toString());
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet.toString());
		
		//15.  NavigableSet<E> descendingSet()
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		descendingSet=descendingSet.descendingSet();
		System.out.println(descendingSet);
		
	}
}

*/
//TreeSet:Set<E> 인터페이스를 구현한 구현 클래스.
//수집한 원소를 집합의 형태로 관리함 저장공간을 동적관리
//입력순서와 관계없이 크기순으로 출력(저장원소는 대소비교가 가능해야 함)
//TreeSet -> NavigableSet -> SortedSet -> Set

