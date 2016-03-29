
public class Opened implements State {

	GarageDoor door;
	
	public Opened(GarageDoor g) {
		this.door=g;
	}
	
	public void close() {
		System.out.println("Door closing");
		door.setState(door.getClosed());
	}

	public void combinationEntered() {
		System.out.println("Error: door not locked");
	}

	public void lock() {
		System.out.println("Error: can't lock as door is open");
	}

	public void open() {
		System.out.println("Error: door already open");
	}

	public void unlock() {
		System.out.println("Error: door already open");
	}
	public void errorEntered() {
		System.out.println("Error: door not locked");
	}
	
}
