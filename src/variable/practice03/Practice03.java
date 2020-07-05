//출제자: 송주현
//
//형변환 관련.
//네과목(국,영,수,과)점수를 실수형으로 입력 받은 후, 
//네과목의 평균을 정수형으로 출력하게 하세요.

package variable.practice03;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kor;
		double eng;
		double math;
		double sci;
		double sum;
		int avg;

		System.out.println("실수형으로 점수 입력");
		System.out.print("국어: ");
		kor = sc.nextDouble();

		System.out.print("영어: ");
		eng = sc.nextDouble();

		System.out.print("수학: ");
		math = sc.nextDouble();

		System.out.print("과학: ");
		sci = sc.nextDouble();

		sum = kor + eng + math + sci;
		avg = (int) (sum / 4);

		System.out.println("네 과목 평균: " + avg);

	}
}