//출제자: 김순기
//배열에 반복문을 사용하여 바나나, 복숭아, 자두, 수박을 넣으시오.
//바나나를 출력하면 바나나 뒤에 원숭이
//복숭아를 출력하면 복숭아 뒤에 악어
//자두를 출력하면 자두 뒤에 고릴라
//수박을 출력하면 수박 뒤에 오징어를 출력하시오.

package array.practice01;

public class Array {
	public static void main(String[] args) {
		
		String[] sArr = new String[4];
		
		for(int i=0; i<sArr.length; i++) {

			if(i==0) {
				sArr[0] = "바나나";
				System.out.println(sArr[0] + " 원숭이");
			} else if(i==1){
				sArr[1] = "복숭아";
				System.out.println(sArr[1] + " 악어");
			} else if(i==2) {
				sArr[2] = "자두";
				System.out.println(sArr[2] + " 고릴라");
			} else if(i==3) {
				sArr[3] = "수박";
				System.out.println(sArr[3] + " 오징어");
			}
		}
	}
}
