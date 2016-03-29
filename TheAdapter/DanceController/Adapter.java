
public class Adapter implements DanceController, GuitarController {
	
	GuitarController guitar;
	DanceController dancepad;
	
	public Adapter(DanceController dancepad) {
		this.dancepad=dancepad;
	}
	
	public Adapter(GuitarController guitar) {
		this.guitar=guitar;
	}
	
	public void Step(direction dir) {	
		System.out.println("look mommy no hands!!");
		switch (dir) {
        case FORWARD: guitar.PressFretButton(GuitarController.colors.BLUE); break;	
        case BACK: guitar.PressFretButton(GuitarController.colors.RED); break;
		}
		guitar.PressPick();
	}

	public void PressFretButton(colors button) {
		System.out.println("look mommy no legs!!");
		switch (button) {
	    case RED: dancepad.Step(DanceController.direction.BACK); break;
        case BLUE: dancepad.Step(DanceController.direction.FORWARD); break;
		}
	}

	public void PressPick() {
		System.out.println("Exception");
	}

	public void PressTremelo() {
		System.out.println("Exception");
		
	}
}
