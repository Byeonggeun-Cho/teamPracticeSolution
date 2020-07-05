//출제자: 김순기
//
//제어문
//스캐너를 입력 받아서 홀수인지 짝수인지 구하고 
//4하고 5는 4입니다. 5입니다 라고 출력하시오.
//만약 숫자가 -이면 마이너스입니다. 출력하시오.
//숫자가 1자리이면 한자리입니다.
//숫자가 2자리이면 두자리입니다.
//숫자가 3자리이면 세자리입니다.
//라고 출력하세요.

package controlStatement.practice01;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		num = sc.nextInt();

		// 홀수/짝수
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// 4,5 구분
		if (num == 4 || num == 5) {
			System.out.println(num + "입니다.");
		}

		// 음수 구분
		if (num < 0)
			System.out.println("마이너스 입니다.");

		// 자릿수 구분
		if (Math.abs(num / 10) < 1) {
			System.out.println("한 자리 숫자 입니다.");
		} else if (Math.abs(num / 10) >= 1 && Math.abs(num / 10) < 10) {
			System.out.println("두 자리 숫자 입니다.");
		} else if (Math.abs(num / 10) >= 10 && Math.abs(num / 10) < 100) {
			System.out.println("세 자리 숫자 입니다.");
		}
	}
}
