package object04.practice04;

import java.util.Scanner;

public class MyExceptionPractice {

	public MyExceptionPractice() {
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.print("C반 학생입니까? (y/n): ");
		ch = sc.next().charAt(0);
		
		try {
			check(ch);
		} catch(MyException e) {
			e.printStackTrace();
		}
		
	}
	
	public void check(char ch) throws MyException {
			if(ch == 'y' || ch == 'Y') {
				System.out.println("반갑습니다.");
			} else {
				throw new MyException("c반 학생만 강의실에 들어올 수 있습니다");
			}
	}
}
