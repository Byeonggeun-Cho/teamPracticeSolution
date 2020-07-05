//출제자: 전진희
//<반복문 연습문제>
// 실행용 클래스 : com.kh.practice3.Main.java
// 기능제공용 클래스 : com.kh.practice3.LoopPractice.java
//	
// 두자리 정수 입력 받는다.
// 1부터 입력받은 숫자까지 출력하고 3의 배수는 숫자 출력 후 옆에 3의 배수인지도 표시
// 예 1 
//   2
//   3은 3의 배수 입니다
//   4...
//

package controlStatement.practice04;

import java.util.Scanner;

public class LoopPractice {

	public LoopPractice() {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("두 자리 정수 입력: ");
		num = sc.nextInt();
	
		for(int i=1; i<=num; i++) {
			System.out.print(i);
			if(i%3==0) {
				System.out.print("은 3의 배수입니다.");
			}
			System.out.println();
		}
	}
}
