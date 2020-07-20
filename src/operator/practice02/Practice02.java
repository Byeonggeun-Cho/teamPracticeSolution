//출제자: 김인서
//<<연산자 문제2>>
// 목표 : 이중 삼항 연산자를 사용하여 입력받은 키와 몸무게로 헌혈이 가능한지 간단하게 판별하는 프로그램을 작성하자.
//  요구 : 삼항연산자를 통해 분기문처럼 사용해 볼 것. 
//  		키와 몸무계는 정수형으로 입력받을 것.
//  		키는 160cm이상, 몸무계는 45kg이상 일시 헌혈이 가능함.
//  출력 예시 : 
// 	===헌혈 자가 진단===
//	키 : 130
//	몸무게 :80
//	불가능
				
package operator.practice02;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		int height;
		int weight;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===헌혈 자가 진단===");
		System.out.print("키: ");
		height = sc.nextInt();
		
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		
		
		System.out.println(height >= 160 ? weight >= 45 ? "가능" : "불가능" : "불가능");
	}
}
