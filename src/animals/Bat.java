package animals;

public class Bat extends RareSpecimen{
	
	public Bat() {}
	
	
	public void fly() {
		this.addEnergy(-50);
		System.out.println("WHOOSHHHHHH");
	}
	
	public void eatHumans() {
		this.addEnergy(25);
	}
	
	public void attackTown() {
		this.addEnergy(-100);
		System.out.println("MY LEG");
	}
	public void getEnergy() {
		System.out.println(String.format("The Bat's energy level is %s", this.showEnergy()));
	}
}
