package object04.practice01;

public abstract class Monster {
	private int hp;
	private String name;
	
	public Monster() {
		System.out.println("Monster가 나타났다!");
	}

	public abstract void die();
	
	public abstract void attack();
	
	public abstract void stat();

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
