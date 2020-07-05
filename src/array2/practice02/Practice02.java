//출제자: 김인서
//<<2차원 배열 문제>>
// 목표 : 2차원 배열의 구조를 출력해 보자.
// 요구 : 인덱스를 입력받아 초기화 상태의 2차원 배열의 모습을 출력해 보자.
// 입력 예시 : 5 2
//  출력 예시 : 
// 	배열 크기1을 입력 : 5
//	배열 크기2를 입력 : 2
//	00000
//	00000

package array2.practice02;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("배열 크기 1을 입력: ");
		num1 = sc.nextInt();
		
		System.out.print("배열 크기 2를 입력: ");
		num2 = sc.nextInt();
		
		int[][] arr = new int[num1][num2];
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = 0;
//			}
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
