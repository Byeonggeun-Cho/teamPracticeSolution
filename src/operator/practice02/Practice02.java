//출제자: 김인서
//
//	<<연산자 문제>>
//	목표 : 전위와 후위 연산자를 다시 되짚고, 이중 삼항 연산자를 써보자.
//	요구 : 전위와 후위의 차이점이 도드라지게 출력될 것.
//		   삼항연산자를 통해 분기문처럼 사용해 볼 것.
//
//문제 불분명하여 재작성 요청함.
//
//<<연산자 문제1>>
//  목표 : 전위와 후위 연산자를 다시 되짚자.
//  요구 : 전위와 후위의 차이점이 도드라지게 출력될 것.
// 
// 입력 예시 : 3  3
// 출력 예시 : 
//	전위 연산자 : 3
//	후위 연산자 : 3
//	============================
//	연산 전
//	3
//	3
//	============================
//	연산 중
//	4
//	3
//	============================
//	연산 이후
//	4
//	4

package operator.practice02;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.print("전위 연산자: ");
		num1 = sc.nextInt();

		System.out.print("후위 연산자: ");
		num2 = sc.nextInt();

		System.out.println("============================");
		System.out.println("연산 전");
		System.out.println(num1);
		System.out.println(num2);

		System.out.println("============================");
		System.out.println("연산 중");
		System.out.println(++num1);
		System.out.println(num2++);

		System.out.println("============================");
		System.out.println("연산 후");
		System.out.println(num1);
		System.out.println(num2);
	}
}