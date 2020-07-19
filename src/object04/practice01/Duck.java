package object04.practice01;

public class Duck extends Monster {
	public Duck() {
		super.setHp(20);
		System.out.println("오리가 나타났다!");
	}

	@Override
	public void die() {
		System.out.println("오리가 죽었다.");
	}

	@Override
	public void attack() {
		System.out.println("오리가 공격한다. 꽥!");
	}

	@Override
	public void stat() {
		System.out.println("오리의 체력: " + this.getHp());
	}
}
