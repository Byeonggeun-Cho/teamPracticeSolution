//출제자: 전진희
//쓰레드에서 자주 쓰이는 메소드에 대해 간략히 설명해보기
//1. run() : Thread 실질적 실행내용
//2. setDaemon() : 메인 Thread 종료 시 함께 종료되는 Dadmon Thread 설정.
//3. start() : Thread내 오버라이딩 된 run()메소드 실행
//4. sleep() : 인자로 전달되는 시간(밀리세컨드:long) 동안 Thread를 not runnable 상태로 전환. (일시 정지) 
//5. interrupt() : Thread 정지요청



//답
//run() : 스레드에서 실질적으로 실행되는 코드 블록
//setDaemon(): 메인 스레드가 종료되면 자동으로 종료되게 설정
//start() : 해당 스레드의 run()메소드 시작하게하는 함수(실행함수)
//sleep(time) : 주어진 시간(밀리초) 동안 스레드 작동 멈춤
//interrupt() : 스레드 강제 종료


package guiThreadNetwork.practice04;

public class Practice {
	
}
