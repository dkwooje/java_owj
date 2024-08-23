package pack3;

public class study5_array_again {

	public static void main(String[] args) {

		int value1 = 3; //기본 자료형의 대입 연산
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		int[] array1 = new int[] {3,4,5}; //참조 자료형의 대입 연산
		int[] array2 = array1;
		array2[0] = 7;
		System.out.println(array1[0]);
		System.out.println(array2[0]);
		/*JAVA에서 기본형(Primitive type)을 제외한 타입들이 모두 참조형(Reference type) 이다.
참조형(Reference type)은 JAVA에서 최상인 java.lang.Object클래스를 상속하는 모든 클래스들을 말한다.
클래스 타입(class type), 인터페이스 타입(interface type), 배열 타입(array type), 열거 타입(enum type) 이 있다.
https://sublivan.tistory.com/4#%EC%B-%B-%EC%A-%B-%EC%-E%--%EB%A-%-C%ED%--%---Reference%--Data%--Type-
https://velog.io/@1205kjw/2.3.1-%EA%B8%B0%EB%B3%B8-%EC%9E%90%EB%A3%8C%ED%98%95%EA%B3%BC-%EC%B0%B8%EC%A1%B0-%EC%9E%90%EB%A3%8C%ED%98%95%EC%9D%98-%EC%B0%A8%EC%9D%B4
*/
	}
}
