
public class Chess extends Game {
	int counter=0;

	boolean endOfGame() {
		if (counter==10) return true;
		else return false;
	}

	void initializeGame() {
		System.out.println("initializing chess");
	}

	void takeTurn(int player) {
		counter++;
		winner=player;
		if (player==0) System.out.println("black "+player+" takes a turn");
		else System.out.println("white "+player+" takes a turn");
	}
	
	void collectResources() {
		System.out.println("collecting all pawns");
		
	}
}
