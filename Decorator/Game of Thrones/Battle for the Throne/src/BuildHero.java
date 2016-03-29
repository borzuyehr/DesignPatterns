
public class BuildHero {

	public static void main(String[] args) {
		Hero Leon = new Lannister();
		Leon = new Bravery(Leon);
		Leon = new Ruthless(Leon);
		Leon = new Honor(Leon);
		System.out.println("Leon: " + Leon.getDescription() + " - conquered a " + Leon.homeLandSize() + " square mile Kingdom.");
	}

}
