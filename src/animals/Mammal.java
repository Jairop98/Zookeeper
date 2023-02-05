package animals;

public abstract class Mammal {
	
	private int energy = 100;
	
	public int displayEnergy() { //getter
		System.out.println("Energy Level: " + this.energy);
		return this.energy;
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
}
