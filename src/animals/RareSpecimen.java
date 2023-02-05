package animals;

public abstract class RareSpecimen {
	
	private int energy = 300;
	
	public int showEnergy() { //getter
		return this.energy;
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
}
