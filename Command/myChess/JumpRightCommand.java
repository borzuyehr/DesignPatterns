
public class JumpRightCommand implements Command {

	private ChessPiece cp;
	
	public JumpRightCommand(ChessPiece k) {
		this.cp=k;
	}
	
	public void move() {
		int x=cp.getX();
		int y=cp.getY();
		char c = toChar(x);
		cp.setPos(x-1,y+2);
		System.out.println(cp.toString()+" jumps from "+c+y+" to "+toChar(cp.getX())    +cp.getY());
	}

	public char toChar(int i) {
		return (char) ('A'+i);
	}

	public void undo() {
		int x=cp.getX();
		int y=cp.getY();
		char c = toChar(x);
		cp.setPos(x+1,y-2);
		System.out.println("Undo:" + cp.toString()+" jumps back "+c+y+" to "+toChar(cp.getX())    +cp.getY());
	}
}
