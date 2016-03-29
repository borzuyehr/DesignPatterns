
public class Honor extends QualityDecorator {
	public Honor(Hero hero) {
		this.hero=hero;
	}
	
	public String getDescription () {
		return hero.getDescription() + ", is Honorable";
	}
	
	public double homeLandSize() {
		return hero.homeLandSize()+10;
	}
}
