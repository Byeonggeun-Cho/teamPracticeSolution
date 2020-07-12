// 출제자: 김순기
// 재미있는 RPG 게임 만들기!
// Monster 클래스, Menu 클래스 만드시오.
// Duck, Chicken, Lion 클래스를 만드시오.
// Duck, Chicken, Lion은 Monster 클래스를 상속 받는다.
// ================================
// Menu를 통해서 1. 던전 들어가기
//           2. 게임 종료하기
// ================================
// 입력 : 
// 를 만드시오.
// 1번을 누르면 Monster가 나타났다!
// 오리가 나타났다!, 닭이 나타났다!, 사자가 나타났다!
// 를 출력하시오.
// 2번을 누르면 게임을 종료하십시오.
// 1 하고 2번 외에 다른 값이 들어가면 다시 입력하시오. 출력하시오.

package object03.practice01;

import java.util.Scanner;

public class Menu {
	public Menu() {
	}

	public void start() {

		int select;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("================================");
			System.out.println("1. 던전 들어가기");
			System.out.println("2. 게임 종료하기");
			System.out.println("================================");
			System.out.print("입력: ");
			select = sc.nextInt();

			if (select == 1) {
				Monster m1 = (Monster) new Duck();
				Monster m2 = (Monster) new Chicken();
				Monster m3 = (Monster) new Lion();

			} else if (select == 2) {
				return;
			} else {
				System.out.println("다시 입력하시오.");
			}
		} while (true);
	}

}
