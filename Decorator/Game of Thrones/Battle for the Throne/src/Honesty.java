
public class Honesty extends QualityDecorator {
	public Honesty(Hero hero) {
		this.hero=hero;
	}
	
	public String getDescription () {
		return hero.getDescription() + ", is Honest";
	}
	
	public double homeLandSize() {
		return hero.homeLandSize()-10;
	}
}
