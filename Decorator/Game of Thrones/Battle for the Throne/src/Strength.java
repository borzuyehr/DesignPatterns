
public class Strength extends QualityDecorator {
	public Strength(Hero hero) {
		this.hero=hero;
	}
	
	public String getDescription () {
		return hero.getDescription() + ", is Strong";
	}
	
	public double homeLandSize() {
		return hero.homeLandSize()+50;
	}
}
