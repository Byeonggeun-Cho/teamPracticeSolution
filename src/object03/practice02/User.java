package object03.practice02;

public class User {
	private String name;
	private int life;
	
	public User() {
		this.life = 3;
	}
	
	public User(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	
}
