package pack8;

import java.util.LinkedList;
import java.util.Queue;


public class study8 {
	public static void main(String[] args) {
		//1. 예외 처리 기능 미포함 메서드
		Queue<Integer> q1 = new LinkedList<Integer>();
		//System.out.println(queue1.element()); // NoSuchElementException
	
		// 1-1. add(E item)
		q1.add(3);
		q1.add(4);
		q1.add(5);
		
		//1-2. element()
		System.out.println(q1.element());
		System.out.println();
		
		//1-3. E remove()
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		//System.out.println(q1.remove());
		System.out.println();
		
		//2. 예외 처리 기능 포함 메서드
		Queue<Integer> q2 = new LinkedList<Integer>();
		System.out.println(q2.peek());
		System.out.println();
		
		//2-1. offer(E item)
		q2.offer(3);
		q2.offer(4);
		q2.offer(5);
		
		//2-2. E peek();
		System.out.println(q2.peek());
		System.out.println();
		
		//2-3. E poll();
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
	}
}

//Queue<E> 컬렉션의 특징
//Stack<E>과는 달리 별도의 interface로 구성
//먼저 들어간 데이터가 먼저 나오는 FIFO 구조
//LinkedList<E> 클래스는 List<E>와 Queue<E> interface를 구현