
public class Bravery extends QualityDecorator {
	public Bravery(Hero hero) {
		this.hero=hero;
	}
	
	public String getDescription () {
		return hero.getDescription() + ", is Brave";
	}
	
	public double homeLandSize() {
		return hero.homeLandSize()+30;
	}
}
