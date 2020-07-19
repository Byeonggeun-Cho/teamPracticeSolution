//출제자: 김순기
//실행용 클레스 Run 클래스를 만드시오.
//동기화처리 클레스 Buffer 클레스를 만드시오.
//제품 생산하는 클레스 Producer 클레스를 만드시오.
//제품 사용하는 클레스 Consumer 클레스를 만드시오.

//공장에서 제품을 생산하고 사용하는 프로그램을 만들어보자.
//하나의 제품이 생산되고사용 되기까지 시간을 2초로 설정하세요
//마지막 제품이 사용되면 마지막 제품이 사용되었습니다. 라고 출력하세요.

//출력 예
//제품 생산 : 0번째 제품이 생산되었습니다.
//제품 사용 : 0번째 제품이 사용되었습니다.
//제품 생산 : 1번째 제품이 생산되었습니다.
//제품 사용 : 1번째 제품이 사용되었습니다.
//제품 생산 : 2번째 제품이 생산되었습니다.
//제품 사용 : 2번째 제품이 사용되었습니다.
//제품 생산 : 3번째 제품이 생산되었습니다.
//제품 사용 : 3번째 제품이 사용되었습니다.
//제품 생산 : 4번째 제품이 생산되었습니다.
//제품 사용 : 4번째 제품이 사용되었습니다.
//마지막 제품이 사용되었습니다.

package guiThreadNetwork.practice01;

public class Run {

	public static void main(String[] args) {
		Buffer bf = new Buffer();
		
		Thread th1 = new Producer(bf);
		Thread th2 = new Consumer(bf);
		
		th1.start();
		th2.start();
	}
}