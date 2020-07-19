package object04.practice01;

public class Lion extends Monster{
	public Lion() {
		super.setHp(300);
		System.out.println("사자가 나타났다!");
	}

	@Override
	public void die() {
		System.out.println("사자가 죽었다.");
	}

	@Override
	public void attack() {
		System.out.println("사자가 공격한다. 어흥!");
	}

	@Override
	public void stat() {
		System.out.println("사자의 체력: " + this.getHp());
	}
}
