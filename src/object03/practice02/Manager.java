package object03.practice02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Manager {
	Scanner sc = new Scanner(System.in);

	public Manager() {
	}

	public void start() {
		int sel;

		User user = new User();

		System.out.println("퀴즈게임 시작~!");
		System.out.print("Q.0 당신의 이름은? : ");
		user.setName(sc.nextLine());

		System.out.println(user.getName() + "님 이군요!");

		do {
			user.setLife(3);
			System.out.println("정보출력: 1");
			System.out.println("문제풀기: 2");
			System.out.println("나가기: 3");

			System.out.print("입력하기: ");
			sel = sc.nextInt();

			switch (sel) {

			case 1:
				printInfo(user);
				break;

			case 2:
				quizGame(user);

				System.out.print("Q." + user.getName() + "님, 다시 하시겠습니까? (Y/N) : ");
				if (sc.next().toUpperCase().charAt(0) == 'Y') {
					break;
				} else {
				}
			case 3:
				System.out.println("*다음에 다시 만나요!*");
				return;
			}

		} while (true);

	}

	public void printScore(User user) {
		System.out.println("==당신의 기록==");
		System.out.println("생명: " + user.getLife());
	}

	public void printInfo(User user) {
		System.out.println("유저이름: " + user.getName());
		System.out.println("생명: " + user.getLife());
	}

	public void quizGame(User user) {
		LinkedHashMap<String, Integer> quizAndAnswer = new LinkedHashMap<String, Integer>();

		quizAndAnswer.put("Q.1 거미의 다리 개수는? : ", new Integer(8));
		quizAndAnswer.put("Q.2 결혼반지는 몇번째 손가락에 끼는가? : ", new Integer(4));
		quizAndAnswer.put("Q.3 개나리 꽃의 꽃잎 수는? : ", new Integer(1));

		Set<Entry<String, Integer>> set = quizAndAnswer.entrySet();
		Iterator<Entry<String, Integer>> iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter.next();
			System.out.print(e.getKey());

			if (e.getValue() == sc.nextInt()) {
				System.out.println("*정답*");
			} else {
				user.setLife(user.getLife() - 1);
				System.out.println("~탈락. " + user.getLife() + " 남았습니다.");
			}

			if (user.getLife() <= 0) {
				System.out.println("당신은 죽었습니다.");
				return;
			}
		}
		
		printScore(user);
		
		if (user.getLife() == 3) {
			System.out.println("문제를 모두 맞추셨어요!");
		}

	}
}
