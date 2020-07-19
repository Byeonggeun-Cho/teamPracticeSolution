package object04.practice01;

public class Player {
	private String name;
	private int hp;
	private int power;
	
	public Player() {}
	
	public Player(String name) {
		this.name = name;
		this.hp = 100;
		this.power = 10;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
}
