public class Player {
private ChessBoard cb;
private int id;	
private int lastplayer;
private int lastpiece;
	
	public Player(ChessBoard cb, int id){
		this.cb=cb;
		this.id=id;
	}
	
	public void move(int piece, int type) {
		if (id==0) {
			System.out.print("White:");
			cb.white[piece].move[type].move();
		}
		else {
			System.out.print("Black:");
			cb.black[piece].move[type].move();
		}
		
//		if (i==-1) {
//			if (id==0) cb.white[lastpiece].move[0].undo();
//			else cb.black[lastpiece].move[0].undo();
//		}
//		else if (id==0) {
//			cb.white[i].move[0].execute();
//		}
//		else {
//			cb.black[i].move[0].execute();
//		}
//		lastplayer=id;
//		lastpiece=i;
	}
}
