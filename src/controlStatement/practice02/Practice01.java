//출제자:김인서
//	<<제어문 문제>>
//	  목표 : 간단한 제어문으로 원하는 문장을 선택하여 완성 해보자.
//	  요구 : if문과 case문을 쓸것.
//	  출력 예시 :
//	  	머리 어깨 무릎 발 무릎 발~
//		(단발/롱) : 롱
//		(1. 원피스/2. 캐주얼/3. 운동복) : 2
//		||||||||
//		|(ㅇㅁㅇ)|
//		|| || ||
//		|     |
//		|     |
//		| | | |
//		 ▲   ▲ 
//		
//		
//		머리 어깨 무릎 발 무릎 발~
//		(단발/롱) : 단발
//		(1. 원피스/2. 캐주얼/3. 운동복) : 1
//		||||||||
//		|(ㅇㅅㅇ)|
//		 ||||||
//		 ||||||
//		||||||||
//	      ▲  ▲ 
//	      
//	      
//	         머리 어깨 무릎 발 무릎 발~
//		(단발/롱) : 롱
//		(1. 원피스/2. 캐주얼/3. 운동복) : 3
//		||||||||
//		|(ㅇㅁㅇ)|
//		|| || ||
//		|     |
//		(     )
//		|  |  |
//		  ▲ ▲ 

package controlStatement.practice02;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("머리 어깨 무릎 발 무릎 발~");
			System.out.print("(단발/롱): ");
			String leng = sc.nextLine();
			
			System.out.print("(1. 원피스/2. 캐주얼/3. 운동복): ");
			int clothes = sc.nextInt();
			sc.nextLine();
			
			if("단발".equals(leng)) {
				System.out.println("||||||||");
				System.out.println("|(ㅇㅅㅇ)|");
			} else {
				System.out.println("||||||||");
				System.out.println("|(ㅇㅁㅇ)|");
				System.out.println("|| || ||");
			}
			
			switch(clothes) {
			case 1:
				System.out.println(" ||||||");
				System.out.println(" ||||||");
				System.out.println("||||||||");
				System.out.println("  ▲  ▲  ");
				break;
			case 2:
				System.out.println("|     |");
				System.out.println("(     )");
				System.out.println("|  |  |");
				System.out.println("  ▲ ▲  ");
				break;
			case 3:
				System.out.println("|     |");
				System.out.println("|     |");
				System.out.println("| | | |");
				System.out.println(" ▲   ▲ ");
				break;
			}
			
			
		}
	}
}
