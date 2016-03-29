import java.util.Random;


public class Catan extends Game {
	static final int maxplayers = 5;
	int[] score = new int[maxplayers]; // inits to 0
	Random r = new Random();
	
	
	boolean endOfGame() {
		for (int i=0;i<maxplayers;i++) {
			if (score[i]==10) {
				winner=i;
				return true;
			}
		}
		return false;
	}

	void initializeGame() {
		System.out.println("initializing Catan");
	}

	void takeTurn(int player) {
		score[player]+=r.nextInt()%2;
		System.out.println("player+" + player + "takes a turn");
	}
	
	void collectResources() {
		System.out.println("collecting all sheep, clay, brick, wood and grain");
	}
}
