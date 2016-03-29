
public class TestGarageDoor {
	public static void main(String[] args) {
		GarageDoor g= new GarageDoor();
		g.open();  
		g.close();
		g.lock();
		g.open(); // this should not work
		g.unlock();  
		g.errorEntered();
		g.unlock();
		g.combinationEntered();
		g.open();
	}
}
