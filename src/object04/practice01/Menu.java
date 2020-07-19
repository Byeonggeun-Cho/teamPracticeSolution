// 출제자: 김순기
//전에 만들었던 object3 게임을 업데이트 해보자.
//Monster 클래스에 이름과 hp를 만들자. 캡슐화적용
//Monster 클래스에 die메소드, attack메소드, stat메소드 정의하기 [추상화메소드]
//player 클래스 만들기 name, hp, power 캡슐화적용
//Monster 클래스 추상화 시키기
//게임 시작시 닉네임을 입력 받는다.
//닉네임: 
//Player 체력은 100 , 공격력은 10으로 지정한다.
//Chicken 체력은 10, Duck은 20, Lion은 300
//맞서 싸우기를 누르면 랜덤으로 오리, 닭, 사자가 나오게 메소드 출력
//m.stat(); m.attack(); m.die(); 순서대로 출력하기


						// 출력 예시 없음...............!!

package object04.practice01;

import java.util.Scanner;

public class Menu {
	public Menu() {
	}

	public void start() {

		int select;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("닉네임: ");
			Player player = new Player(sc.nextLine());			
			
			
			System.out.println("================================");
			System.out.println("1. 던전 들어가기");
			System.out.println("2. 게임 종료하기");
			System.out.println("================================");
			System.out.print("입력: ");
			select = sc.nextInt();

			
			if (select == 1) {
				
				int temp = (int)Math.random()*3;
				
				if(temp == 0) {
					Monster m = new Chicken();
					m.stat();
					m.attack();
					m.die();
				} else if(temp == 1) {
					Monster m = new Duck();
					m.stat();
					m.attack();
					m.die();
				} else {
					Monster m = new Lion();
					m.stat();
					m.attack();
					m.die();
				}
				
			} else if (select == 2) {
				return;
			} else {
				System.out.println("다시 입력하시오.");
			}
			
			sc.nextLine();
			
		} while (true);
	}

}
