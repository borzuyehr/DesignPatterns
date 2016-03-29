

public class GarageDoorOpenCommand implements Command {
	GarageDoorRemote garageDoor;

	public GarageDoorOpenCommand(GarageDoorRemote garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		try {
			garageDoor.up(); }
			catch (Exception e) {
				e.printStackTrace();
			}
		}
}
