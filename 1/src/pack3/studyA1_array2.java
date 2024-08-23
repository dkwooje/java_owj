package pack3;

public class studyA1_array2 {
	public static void main(String[] args) {
		
		int[][] array1 = new int[2][3];
		System.out.println(array1.length); //행 갯수
		System.out.println(array1[0].length); // 첫 번째 행의 열 개수
		System.out.println(array1[1].length); // 두 번째 행의 열 개수
		System.out.println();
		
		int[][] array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		System.out.println();
		
		System.out.print(array2[0][0]+" ");
		System.out.print(array2[0][1]+" ");
		System.out.println();
		System.out.print(array2[1][0]+" ");
		System.out.print(array2[1][1]+" ");
		System.out.print(array2[1][2]+" ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int[][] array3 = new int[][] {{1,2,5,6,7},{3,4,5,10,11,12,13,14}};
		
		for(int i=0; i<array3.length; i++) {			//i: 배열의 행 j: 행의 행
			for(int j = 0; j< array3[i].length; j++) {
				System.out.print(array3[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[]array: array3) {				//2차원 배열을 1차원으로 key:value
			for(int k: array) {					//1차원 배열을 정수로
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
