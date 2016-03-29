
public class Monopoly extends Game {
	int counter=0;

	boolean endOfGame() {
		if (counter==100) return true;
		else return false;
	}

	void initializeGame() {
		System.out.println("initializing monopoly");
	}

	void takeTurn(int player) {
		counter++;
		winner=player;
		System.out.println("player "+player+" takes a turn");
	}
	void collectResources() {
		System.out.println("grabbing all that money");
	}
}
