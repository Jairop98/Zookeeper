package animals;

public abstract class Reptile {
	
	private int energy = 50;
	
	public int getEnergy() { //getter
		return this.energy;
	}
	
	public void addEnergy(int change) {
		this.energy += change;
	}
	  
}
