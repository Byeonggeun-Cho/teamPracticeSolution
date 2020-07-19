//출제자: 전진희
// 수업시간에 진행한 HashMap 내용에서 저장된 객체만 변경하여 출제한 것입니다.
//
// 패키지명 : com.kh.practice09
// 클래스명 : com.kh.practice09.IteratorPractice
//
//
// + practice01 : void 메소드 생성
// HashMap hmap 에  
// 1. key : "사당" ,  value : "2호선"
//    key : "공덕" ,  value : "6호선"
//    key : "충무로" ,  value : "4호선"
//    key : "왕십리" ,  value : "5호선"
//    key : "노량진" ,  value : "9호선"
//    짝지어진 키, 값 객체를 저장하고
//    키 "사당"에 대한 값 객체를 "4호선"으로 변경하세요
//    키 "충무로" 객체와 짝지어진 값 객체를 삭제하세요
// 
// 2. keySet() 이용해서 키만 따로 set으로 만든 후 iterator()메소드로 목록 만들어 연속처리하여 출력
// 3. Map 내부 클래스인 EntrySet 이용 : entrySet() -> iterator() 메소드로 목록 만들어 연속처리하여 출력
//
//출력 예시
//keySet()을 이용하여 키만 set으로 만들고 iter()메소드로 목록 만들어 연속 처리
//노량진 = 9호선
//왕십리 = 5호선
//사당 = 4호선
//공덕 = 6호선
//
//Map의 내부 클래스인 EntrySet을 이용 : entrySet()
//노량진 : 9호선
//왕십리 : 5호선
//사당 : 4호선
//공덕 : 6호선

package collection.practice04;

public class Run {

	public static void main(String[] args) {
		IteratorPractice ip = new IteratorPractice();
		ip.practice01();
	}

}
