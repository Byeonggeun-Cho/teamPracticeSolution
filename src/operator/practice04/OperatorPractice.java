//출제자: 전진희
//
//2.연산자
//
//패키지 : com.kh.practice02
//기능제공용 클래스 : com.kh.practice02.OperatorPractice
//실행용 클래스 : com.kh.practice02.Run
//
//문제해결 시나리오 유형 점수와 서술형
//유형 점수를 입력받아 삼항연산자를
//이용하여 두 유형 각각 40점 이상이고
//평균이 60점 이상일 때 통과와 재시 여부
//출력

package operator.practice04;

import java.util.Scanner;

public class OperatorPractice {

	public OperatorPractice() {

		Scanner sc = new Scanner(System.in);

		int score1;
		int score2;

		System.out.print("문제해결 시나리오 유형 점수: ");
		score1 = sc.nextInt();

		System.out.print("서술형 점수: ");
		score2 = sc.nextInt();

		System.out.println((score1 >= 40 && score2 >= 40)
							? (score1 + score2) / 2 >= 60 ? "합격"
														  : "재시험"
							: "재시험");
	}
}