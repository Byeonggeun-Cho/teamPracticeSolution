//출제자: 송주현
//[2차원배열]
// 패키지 : study.배열
// 실행용클래스,기능제공용 클래스 : study.배열.study_05.java
//
//

//[문제]
//3*3 배열을 선언한 후,
//1부터 9까지 출력해보세요.
//
//[출력]
//	1 2 3 
//	4 5 6 
//	7 8 9 


package array2.practice03;

public class study05 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
