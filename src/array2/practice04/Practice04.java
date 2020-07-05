//출제자: 전진희
//아래 2차배열의 iarr[0][0]부터 iarr[3][3]까지의 합을 for문을 이용하여 구하기
//
//int[][] iarr = {
//   		   		{1 , 4, 7, 10},
//   		   		{100, 20, 3, 324},
//   		   		{78, 577, 89, 1000},
//   		   		{1, 44, 77, 993}
//				};

package array2.practice04;

public class Practice04 {
	public static void main(String[] args) {

		int[][] iarr = { { 1, 4, 7, 10 },
						 { 100, 20, 3, 324 },
						 { 78, 577, 89, 1000 },
						 { 1, 44, 77, 993 }
					   };
		
		int sum=0;
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				sum += iarr[i][j];
			}
		}

		System.out.println("합계: " + sum);
	}
}
