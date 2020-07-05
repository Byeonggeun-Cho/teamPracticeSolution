//출제자: 송주현
//2) +@
//[제어문]
// 패키지 : study.제어문
// 실행용클래스,기능제공용 클래스 : study.제어문.study_03.java
//
//
//[문제]
//정수를 입력 받아, 입력받은 숫자까지의 단 출력.
// -출력예시
// 몇단까지 출력하시겠습니까? : 5
// 2단 : 2*1=2, 2*2=4 ... 2*9=18
// 3단 : ...
// 4단 : ...
// 5단 : 5*1=5, 5*2=10, ... 5*9=45

package controlStatement.practice03;

import java.util.Scanner;

public class Study03Alpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("몇 단까지 출력하시겠습니까? : ");
		num = sc.nextInt();
		
		for(int dan=2; dan<=num; dan++) {
			System.out.print(dan + "단 : ");
			for(int su=1; su<10; su++) {
				System.out.print(dan + " * " + su + " = " + (dan * su) + ", ");
			}
			System.out.println();
		}
	}
}
