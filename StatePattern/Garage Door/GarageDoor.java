public class GarageDoor {

	State Opened;
	State Locked;
	State Closed;
	State AwaitingCombination;
	State state;
	
	public GarageDoor() {
		System.out.println("creating a garagedoor");
		Opened= new Opened(this);
		Closed= new Closed(this);
		Locked = new Locked(this);
		AwaitingCombination= new AwaitingCombination(this);
		state=Closed;
	}
	
	public void close() {
		state.close();
	}
	
	public void open() {
		state.open();
	}
	
	public void lock() {
		state.lock();
	}
	
	public void unlock() {
		state.unlock();
	}
	
	public void combinationEntered() {
		state.combinationEntered();
	}
	
	public void errorEntered() {
		state.errorEntered();
	}
	
	public void setState(State t) {
		this.state=t;
	}
	
	public State getOpened() {
		return Opened;
	}
	public State getLocked() {
		return Locked;
	}
	public State getClosed() {
		return Closed;
	}
	public State getAwaitingCombination() {
		return AwaitingCombination;
	}
	
}
