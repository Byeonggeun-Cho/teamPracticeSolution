//출제자: 전진희
//vo클래스 : com.kh.practice05.Beverage.java
//main클래스 : com.kh.practice05.Main.java

//vo클래스 ----------------------------------- 
//- beverage : String //음료 이름
//- price : int       //가격
//- hotOrIce : char   //핫, 아이스 여부 ('H', 'I'로 표기)
//기본생성자, 모든 멤버변수를 매개변수로 하는 생성자, 모든 멤버변수에 대한 setter/getter메소드 생성

//main클래스 -------------------------------------
//Beverage 클래스에 대한 크기가 4인 객체 배열 생성
// 네가지 음료    ex) 아메리카노, 4500, 'H' 
// 에 대한 객체 생성하여 배열에 담고 객체에 접근하여 네가지 음료의 가격 출력


package object.practice04;

public class Main {

	public static void main(String[] args) {
		Beverage[] b = new Beverage[4];
		
		b[0] = new Beverage("아메리카노(hot)", 4000, 'H');
		b[1] = new Beverage("아메리카노(iced)", 4500, 'I');
		b[2] = new Beverage("카페모카", 5000, 'H');
		b[3] = new Beverage("자바칩프라푸치노", 6500, 'I');
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i].getBeverage() + " : " + b[i].getPrice());
		}
		
	}

}
