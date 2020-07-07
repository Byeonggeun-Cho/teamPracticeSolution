//출제자: 송주현
//1)
//[제어문]
// 패키지 : study.제어문
// 실행용클래스,기능제공용 클래스 : study.제어문.study_03.java
//
//
//출제자: 송주현
//[문제]
//정수를 입력 받아, 그 수가 양수 일 때, 구구단이 출력되게 하세요.
//단, 양수가 아닐 경우 양수가 아닙니다. 출력
//
//예시
// 단수 : 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
//  ...
// 2 * 9 = 18
//------
//정수 입력 : -1
//양수가 아닙니다. 다시 입력하세요.

package controlStatement.practice03;

import java.util.Scanner;

public class Study03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.println("구구단 입력");
		System.out.print("단수: ");
		dan = sc.nextInt();

	
		if(dan >0) {
			
			for(int i=1; i<10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		} else {
			System.out.println("양수가 아닙니다. 다시 입력하세요.");
		}
		
	}
}