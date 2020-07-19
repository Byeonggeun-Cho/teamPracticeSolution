//출제자: 송주현
//패키지 : study.E_객체
//클래스 : study.E_객체.study_013.java
//
//자바 정석 연습문제3 - 객체 이해하기
//
//[문제]
//다음은 컴퓨터 게임의 병사(study13marine)를 클래스로 정의한 것이다. 
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가? 
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
//	public class study13marine {
//	
//		int x=0, y=0; //Marine의 위치좌표 (x,y) 
//		int hp = 60; //현재 체력 
//		int weapon = 6; //공격력 		// static으로 변환
//		int armor = 0; //방어력		// static으로 변환
//			// -> 공격력과 방어력은 모든 병사의 공통요소로, 동일하게 적용되어야 한다.
//	
//		void weaponUp() {			// static 변수(weapon)를 가진 함수는 static으로 선언
//			weapon++; 
//		} 
//	
//		void armorUp() { 			// static 변수(armor)를 가진 함수는 static으로 선언
//			armor++; 
//		} 
//	
//		void move(int x, int y) { 
//			this.x = x; 
//	
//			this.y = y; 
//		} 
//	}

package inputOutput.practice03;

public class Study13 {

}
