public abstract class ChessPiece {
	public int Xpos;
	public int Ypos;
	String Name;
	Command move[];	
	
	public ChessPiece(int x, int y) {
		Xpos=x;
		Ypos=y;
	}
	
	int getX(){
		return Xpos;
	}
	int getY() {
		return Ypos;
	}
	
	void setPos(int x, int y){
		Xpos=x;
		Ypos=y;
	}
	
	public String toString() {
		return Name;
	}
}