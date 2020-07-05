//출제자: 김인서
//<<배열 문제>>
//	 목표 : 배열 복사의 깊은 복사를 사용해보기.
//	 		값과 주소값을 출력해보자.
//	 요구 : 배열 복사를 하되, 기존의 배열에는 영향을 주지 않을 것.
//	  출력 예시 : 
//		 
//		배열 arr의 정보 출력
//		arr의 길이 : 5
//		arr의 0번째 값 : 0
//		arr의 1번째 값 : 0
//		arr의 2번째 값 : 0
//		arr의 3번째 값 : 0
//		arr의 4번째 값 : 0
//		arr의 hashCode주소 : 356573597
//		int[] arr1 = arr;
//		arr1[0] = 3;
//		배열 arr1의 정보 출력
//		arr1의 길이 : 5
//		arr1의 0번째 값 : 3
//		arr1의 1번째 값 : 0
//		arr1의 2번째 값 : 0
//		arr1의 3번째 값 : 0
//		arr1의 4번째 값 : 0
//		arr1의 hashCode주소 : 356573597
//		arr의 0번째 값 : 3
//		arr의 1번째 값 : 0
//		arr의 2번째 값 : 0
//		arr의 3번째 값 : 0
//		arr의 4번째 값 : 0

package array.practice02;

public class Practice02 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		System.out.println("arr의 hashCode주소: " + arr.hashCode());

		int[] arr1 = arr;
		System.out.println("int[] arr1 = arr;");
		
		System.out.println("arr1의 정보출력");
		System.out.println("arr1의 길이: " + arr1.length);
		
		arr1[0] = 3;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1의 " + i + "번째 값: " + arr1[i]);
		}
		System.out.println("arr1의 hashCode주소: " + arr1.hashCode());
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr의 " + i + "번째 값: " + arr[i]);
		}
	}
}
