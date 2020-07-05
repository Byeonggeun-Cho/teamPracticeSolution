//출제자: 송주현
//
//아래 내용을 선언
//키보드로 입력받은 값을 입력받아,
//'이름' 은/는 '교통수단' 을 타고 kh학원까지 오는데 '소요시간(분)'분이 소요된다.
//만약 입력받은 소요시간이 60분 이상일 경우 
//'이름' 님 힘내세요 화이팅!'이 출력되게 작성하세요.
	
//문자열 - 이름
//문자열 - 교통수단
//정수 - 소요시간(분)

package operator.practice03;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String pubTr;		// public Transport
		int time;
		
		System.out.print("이름: ");
		name = sc.nextLine();
		
		System.out.print("교통수단: ");
		pubTr = sc.nextLine();
		
		System.out.print("소요시간(분): ");
		time = sc.nextInt();
		
		System.out.println(name + "은/는 " + pubTr + "을/를 타고 kh학원까지 오는데 "
							+ time + "분이 소요된다.");
		
		if(time > 60)
			System.out.println(name + "님 힘내세요 화이팅!");
		
	}
}