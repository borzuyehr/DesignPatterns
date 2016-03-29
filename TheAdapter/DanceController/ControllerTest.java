public class ControllerTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanceController dancemat = new DDRDancemat();
		GuitarController gibson = new GibsonSG();
		
		gibson.PressFretButton(GuitarController.colors.RED);
		dancemat.Step(DanceController.direction.FORWARD);
		
		DanceController Dance2Guitar = new Adapter(gibson);
		Dance2Guitar.Step(DanceController.direction.FORWARD);
		
		GuitarController Guitar2Dance = new Adapter(dancemat);
		Guitar2Dance.PressFretButton(GuitarController.colors.RED);
		}
}
