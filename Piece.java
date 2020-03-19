public abstract class Piece{
	public int posX; 
	public int posY;
	public char team;
	public String type;
	
	public abstract boolean canMove(int desX, int desY, Board board);
}
