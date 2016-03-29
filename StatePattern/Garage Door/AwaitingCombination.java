
public class AwaitingCombination implements State {

	GarageDoor door;
	
	public AwaitingCombination(GarageDoor g) {
		this.door=g;
	}
	
	public void close() {
		System.out.println("Error: door already closed!!");
	}

	public void combinationEntered() {
		System.out.println("Unlocking door");
		door.setState(door.getClosed());
	}

	public void lock() {
		System.out.println("Error: in unlock mode");
	}

	public void open() {
		System.out.println("Error: give correct combination");

	}

	public void unlock() {
		System.out.println("Error: already in unlock mode ");
	}
	
	public void errorEntered() {
		System.out.println("Error: wrong code");
		door.setState(door.getLocked());
	}

}
