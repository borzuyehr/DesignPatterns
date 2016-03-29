public class Pawn extends ChessPiece {

	public Pawn(int x, int y) {
		super(x,y);
		Xpos=x;
		Ypos=y;
		Name="Pawn";
		move[0]=new MoveCommand(this);
	}
}
