//출제자: 전진희
//1.변수
//패키지 : com.kh.practice01
//기능제공용 & 실행용 클래스 : com.kh.practice01.VariablePractice
//
//실수형 숫자를 변수에 담아 초기화 하고
//정수형으로 출력하시오
//
//예) 실수형 숫자 : 12.34
//		출력 : 12

package variable.practice04;

public class VariablePractice {
	public static void main(String[] args) {
		double num = 12.34;

		System.out.printf("실수형 숫자\t: %.2f\n", num);
		System.out.printf("출력\t: %d\n", ((int) num));

	}
}