
public class Ruthless extends QualityDecorator {
	public Ruthless(Hero hero) {
		this.hero=hero;
	}
	
	public String getDescription () {
		return hero.getDescription() + ", is Ruthless";
	}
	
	public double homeLandSize() {
		return hero.homeLandSize()+40;
	}
}
