package pack3;

public class study3_array {

	public static void main(String[] args) {
		
		int[] array1 = new int[3];
		array1[0]=3;
		array1[1]=4;
		array1[2]=5;
		System.out.println(array1[0]+" "+ array1[1]+" "+ array1[2]);
		
		int[]array2;
		array2=new int[3];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		System.out.println(array2[0]+" "+array2[1]+" "+array2[2]);
		
		int[]array3= new int[] {3,4,5};
		System.out.println(array3[0]+" "+array3[1]+" "+array3[2]);
		
		int[]array4;
		array4=new int[] {3,4,5};
		System.out.println(array4[0]+" "+array4[1]+" "+array4[2]);
		
		int[]array5= {3,4,5};
		System.out.println(array5[0]+" "+array5[1]+" "+array5[2]);
		
		/*
			int[] array6;
			array6= {3,4,5};
			System.out.println(array6[0]+" "+array6[1]+" "+array6[2]);
			*/ //불가능(배열의 선언과 객체 대입을 분리 불가능)
	}

}
