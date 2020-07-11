//출제자: 김순기
//학생 정보를 담는 Student 라는 클래스와 run을 위한 TestObject 클래스를 만드시오.
//학생 정보는 [ 이름 , 나이 , 성별, 전화번호 ] 를 받는다. ( String, int, char, String )
//Student 클래스에서는 String을 반환하는 getInfomation 이라는 메소드를 만들고 학생 정보를 반환한다.
//Student를 캡슐화를 해서 만드시오!

//데이터 입력은 스캐너를 사용해서 입력 받습니다.

//출력은 getInfomation를 사용한다.

//출력 예: 학생의 이름은 홍길동이고 나이는 20살 성별은 남 전화번호는 010-5555-1111 입니다.

package object.practice01;

public class Student {
	private String name;
	private int age;
	private char gender;
	private String phoneNum;

	public Student() {}
	
	public Student(String nama, int age, char gender, String phoneNum) {
		super();
		this.name = nama;
		this.age = age;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getInformation() {
		return "학생의 이름은 " + this.getName() + "이고 나이는 " + this.getAge()
		+ "살 성별은 " + this.getGender() + " 전화번호는 " + this.phoneNum + " 입니다.";
	}
	
}
