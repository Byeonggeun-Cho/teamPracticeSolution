package object04.practice01;

public class Chicken extends Monster {
	
	public Chicken() {
		super.setHp(10);
		System.out.println("닭이 나타났다!");
	}

	@Override
	public void die() {
		System.out.println("닭이 죽었다.");
	}

	@Override
	public void attack() {
		System.out.println("닭이 공격한다. 꼬끼오!");
	}

	@Override
	public void stat() {
		System.out.println("닭의 체력: " + this.getHp());
	}
}
