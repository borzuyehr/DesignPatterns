public class Knight extends ChessPiece {
	
	public Knight(int x, int y) {
		super(x,y);
		Xpos=x;
		Ypos=y;
		Name="Knight";
		this.move[0] = new JumpLeftCommand(this);
		this.move[1] = new JumpRightCommand(this);
	}
}
