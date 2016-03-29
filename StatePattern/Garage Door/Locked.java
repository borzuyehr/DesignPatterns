
public class Locked implements State {


	GarageDoor door;
	
	public Locked(GarageDoor g) {
		this.door=g;
	}
	
	
	public void close() {
		System.out.println("Error: door already closed");

	}

	public void combinationEntered() {
		System.out.println("Error: not unlocking");

	}

	public void lock() {
		System.out.println("Error: door already locked");

	}

	public void open() {
		System.out.println("Error: door is locked");

	}

	public void unlock() {
		System.out.println("Enter combination");
		door.setState(door.getAwaitingCombination());
	}
	
	public void errorEntered() {
		System.out.println("Error: not unlocking");
	}

}
