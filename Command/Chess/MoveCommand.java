public class MoveCommand implements Command {

	private ChessPiece cp;
	
	public MoveCommand(ChessPiece k) {
		this.cp=k;
	}
	
	public void move() {
		int x=cp.getX();
		int y=cp.getY();
		char c = toChar(x);
		cp.setPos(x,y+1);
		System.out.println(cp.toString()+" moves from "+c+y+" to "+toChar(cp.getX())    +cp.getY());
	}

	public char toChar(int i) {
		return (char) ('A'+i);
	}

	
	public void undo() {
		int x=cp.getX();
		int y=cp.getY();
		char c = toChar(x);
		cp.setPos(x,y-1);
		System.out.println("Undo:" + cp.toString()+" moves back "+c+y+" to "+toChar(cp.getX())    +cp.getY());
	}
}
