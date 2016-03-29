
public class GibsonSG implements GuitarController {

	public void PressFretButton(colors button) {
		System.out.println("pressing fret button:"+ button);

	}

	public void PressPick() {
		System.out.println("pressing pick");

	}

	public void PressTremelo() {
		System.out.println("pressing Tremolo");
	}
}
