//출제자: 김순기
//
//switch문만을 사용하는 문제
//스캐너로 동물 이름을 입력 받아서 사자면 동물의왕
//호랑이면 포유류, 개구리면 양서류
//고양이면 포유류, 고슴도치는 가시맨
//고릴라면 초식동물을 출력하시오.
//모기가 나온다면 그건 무시하시오.
//여기에 없는 동물이 나온다면 미지의동물 이라고 출력

package controlStatement.practice01;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String spiec = "";

		System.out.print("동물이름 입력: ");
		switch (sc.nextLine()) {

		case "사자":
			spiec = "동물의 왕";
			break;
		case "호랑이":
		case "고양이":
			spiec = "포유류";
			break;
		case "개구리":
			spiec = "양서류";
			break;
		case "고슴도치":
			spiec = "가시맨";
			break;
		case "고릴라":
			spiec = "초식동물";
			break;
		case "모기":
			break;
		default:
			spiec = "미지의 동물";
		}

		System.out.println(spiec);
		
	}

}
