
public class ChessBoard {
	
	 public ChessPiece white[] = new ChessPiece[2]; // only 2 pieces 
	 public ChessPiece black[] = new ChessPiece[2];
		    
	public ChessBoard() {
			white[0]=new Pawn(0,0);
			white[1]=new Knight(1,0);
			black[0]=new Pawn(7,0);
			black[1]=new Knight(6,0);
	}
}
