//출제자: 김인서
//
//<<변수 문제>>
//목표 : 대표적인 변수형들과 그 변수들의 바이트 값을 출력하자.
// 		(.BYTES 사용/사용불가시에 공란)
//요구 : 각각  초기화를 하고, 그 값을 출력할 것.

package variable.practice02;

public class Practice02 {

	public static void main(String[] args) {

		boolean b = true; // .Byte 사용불가

		byte bnum = 1;
		short snum = 2;
		int inum = 3;
		long lnum = 4L;

		float fnum = 5.0f;
		double dnum = 6.0;

		char ch = 'A';

		String str = "Hello";
		// String class객체로 기본 데이터형과 다르게 byte값 미정

		System.out.println("[논리 대표]boolean: " + b);

		System.out.println("byte: " + Byte.BYTES);
		System.out.println("short: " + Short.BYTES);
		System.out.println("[정수 대표]int: " + Integer.BYTES);
		System.out.println("long: " + Long.BYTES);

		System.out.println("float: " + Float.BYTES);
		System.out.println("[실수 대표]double: " + Double.BYTES);

		System.out.println("[문자 대표]char: " + Character.BYTES);

		System.out.println("[문자열 대표]String :" + str);
	}
}
