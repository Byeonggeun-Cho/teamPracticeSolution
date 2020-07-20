//출제자: 김순기
//while문을 사용해서 구구단을 출력하시오.
//2단부터 19단까지
//19단 중에 4단은 빼고 출력하시오.
//19단 중에 결과값이 22하고 63하고 133은 결과값을
//이십이, 육십삼, 백삼십삼을 출력하시오.
package controlStatement.practice01;

public class Practice04 {

	public static void main(String[] args) {
		int dan = 2;
		
		while(dan < 20) {
			if(dan != 4) {
				for(int su = 1; su<10; su++) {
					int result = dan*su;
					
					switch(result) {
					case 22:
						System.out.println(dan + " x " + su + " = " + "이십이");
						break;
					case 63:
						System.out.println(dan + " x " + su + " = " + "육십삼");
						break;
					case 133:
						System.out.println(dan + " x " + su + " = " + "백삼십삼");
						break;
					default:
						System.out.println(dan + " x " + su + " = " + result);
					}
				}
				System.out.println();
			}
			
			dan++;
		}
	}
}
