//출제자: 송주현
//1)
//[배열]
// 패키지 : study.배열
// 실행용클래스,기능제공용 클래스 : study.배열.study_04.java
//
//

//[문제]
//양의 정수 10개를 입력받아 배열에 저장하고,
//배열에 있는 정수 중 3의 배수만 출력하세요.
//
//[출력]
//		정수 10개를 입력하세요 : 
//		1
//		3
//		5
//		4
//		62
//		8
//		2
//		3
//		1
//		2
//		입력받은 정수의 3의 배수는 : 
//		3
//		3

package array.practice03;

import java.util.Scanner;

public class study04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.println("정수 10개를 입력하세요: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("입력받은 정수 중 3읭 배수는: ");
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
