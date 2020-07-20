//출제자: 김순기
//반복문을 사용하여 1부터 100까지 반복문을 돌리고
//2로 나눠서 나머지가 1인 숫자를 모두 출력 하시오.
//나머지가 1인 숫자들을 전부 더하시오.
//전부 더한 값을 10씩 10번 빼시오.

package controlStatement.practice01;

public class Practice03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		
		for(int i=0; i<10; i++) {
			sum -= 10;
		}
		
		System.out.println("\nsum: " + sum);
		
	}
}
