//출제자: 송주현
//	1. 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)	// 2 5
//	    a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
//	    b. 생성자는 객체를 생성하기 위한 것이다.
				// 객체의 초기화를 위해 사용. (인스턴스의 생성은 new 연산자가 수행)
//	    c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
//	    d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
//	    e. 생성자는 오버로딩 할 수 없다.
			// 생성자는 매개변수를 달리하여 오버로딩 가능.
//	
//	2. 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)	// b
//	    a. 객체 자신을 가리키는 참조변수이다.
//	    b. 클래스 내에서라면 어디서든 사용할 수 있다.
				// 객체가 할당되어 인스턴스가 생성된 이후 사용 가능.
				// static 변수, 클래스(인스턴스)변수에서는 사용 불가.
//	    c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
//	    d. 클래스 메서드 내에서는 사용할 수 없다.
//	
//	********************************************************* 출제자에 질문: d는?
//	3. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)	// c d
//	    a. 메서드의 이름이 같아야 한다.
//	    b. 매개변수의 개수나 타입이 달라야 한다.
//	    c. 리턴타입이 달라야 한다.
			// 리턴타입은 관계없음
//	    d. 매개변수의 이름이 달라야 한다.
			// 매개변수의 이름은 관계없음
//	
//	4. 다음 중 인스턴스변수의 초기화 순서가 올바른 것은?				// a
//	    a. 기본값-명시적초기화-초기화블럭-생성자
//	    b. 기본값-명시적초기화-생성자-초기화블럭
//	    c. 기본값-초기화블럭-명시적초기화-생성자
//	    d. 기본값-초기화블럭-생성자-명시적초기화
//	
//	5. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)	// a e
//	    a. 자동 초기화되므로 별도의 초기화가 필요없다.
			// 멤버변수(자동) != 지역변수(수동)
//	    b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
//	    c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
//	    d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
//	    e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
			// stack영역에 생성된다.

package guiThreadNetwork.practice03;

public class Practice {

}