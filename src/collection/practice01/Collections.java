package collection.practice01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Collections {
	Scanner sc = new Scanner(System.in);

	public Collections() {
	}

	public void array() {
		boolean isEnd = false;

		ArrayList<Integer> alist = new ArrayList<Integer>();

		while (!isEnd) {
			String temp = "";

			System.out.print("정수: ");
			temp = sc.nextLine();

			if ("exit".equals(temp)) {
				isEnd = true;
			} else {
				alist.add(Integer.parseInt(temp));
			}
		}

		Iterator iter = alist.iterator();

		while (iter.hasNext()) { // alist.iterator().hasNext() ?
			System.out.println(iter.next()); // alist.iterator().next() ?
			// 매 번 새로운 iterator()를 호출하므로 첫 번째 값만 꺼내오게 된다.
		}
	}

	public void hashSet() {
		boolean isEnd = false;

		HashSet<String> hSet = new HashSet<String>();

		while (!isEnd) {
			String temp = "";

			System.out.print("이름: ");
			temp = sc.nextLine();

			if ("exit".equals(temp)) {
				isEnd = true;
			} else {
				hSet.add(temp);
			}
		}

		Iterator iter = hSet.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
