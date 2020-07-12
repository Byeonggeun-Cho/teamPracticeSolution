//출제자: 송주현
//[객체-추상화,다형성]
// 패키지 : study.객체
// 실행용클래스,기능제공용 클래스 : study.객체.study_07.java
//
//[문제]
//
// 
//
/*abstract class Shape {
	   public void paint() { draw(); } 
	   abstract public void draw();
	}
	class Circle extends Shape {
	   private int radius;
	   public Circle(int radius) { this.radius = radius; }
	   double getArea() { return 3.14 * radius * radius; }
	}
*/
//(1) 다음 중 오류가 발생하는 것을 고르세요.
//
// 1. Shape s;    2. Shape s = new Shape;    3. Circle c;    4. Circle c = new Circle(10);
//
//
//
//(2) 다음 코드의 실행 결과 "반지름=10"이 출력되도록 Circle 클래스를 수정하세요.
//
// Circle p = new Circle(10);
// p.paint();
//
//
//	1. (2)번: 추상클래스는 객체 생성이 불가능.
//
//	2. @Override
//	   public void draw() {
//	       System.out.println("반지름=" + this.radius);
//	   }

package object02.practice03;

public class Study {
	
}
