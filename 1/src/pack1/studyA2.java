package pack1;

public class studyA2 {

	public static void main(String[] args) {
		
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		int a=5;
		int b=2;
		int c=5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println();
		
		String str1 = new String("안녕"); // str1과 str2가 할당된 주소값이 다르다.
		String str2 = new String("안녕"); // str1은 100의 주소 str2는 200의 주소값을 갔는다.
		System.out.println(str1 == str2); // 위의 int는 주소값 보다는 정수값을 계산한다.
		 

	}

}
