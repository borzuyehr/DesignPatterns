
public class Closed implements State {

	GarageDoor door;
	
	public Closed(GarageDoor g) {
		this.door=g;
	}
	
	public void close() {
		System.out.println("Error: door already closed!!");
	}

	public void combinationEntered() {
		System.out.println("Error: door was not locked");
	}

	public void lock() {
		System.out.println("locking door");
		door.setState(door.getLocked());
	}

	public void open() {
		System.out.println("Door opening");
		door.setState(door.getOpened());
	}

	public void unlock() {
		System.out.println("Error: door was not locked");
	}
	
	public void errorEntered() {
		System.out.println("Error: door not locked");
	}

}
