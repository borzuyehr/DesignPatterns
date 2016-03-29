abstract class Game {
 
     protected int playersCount;
     int winner;
     abstract void initializeGame();
     abstract void takeTurn(int player);
     abstract boolean endOfGame();
     abstract void collectResources();
 
     void declarewinner(){ 
    	 System.out.println("Player" + winner + "wins");
     }
     
    /* A template method : */
    final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()) {
            takeTurn(j);
            j = (j + 1) % playersCount;
        }
        declarewinner();
        collectResources();
    }
}