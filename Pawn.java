import sun.net.www.content.audio.x_aiff;

public class Pawn extends Piece{
	
	public Pawn(int x, int y, char s, Board gameBoard) {
		this.posX = x;
		this.posY = y;		
		this.team = s;
		// System.out.println(team);
		this.type = team + "Paw";
		gameBoard.addPiece(x, y, this);
	}
	
	public boolean canMove (int desX, int desY, Board board) {
		if (this.team == 'B') {
			// If the destination is one directly below its current position and there is no piece in its destination
			if (desY == posY + 1  && desX == posX && board.gameBoard[desY][desX] == null) {
				posX = desX;
				posY = desY;
				return true;
			}
			// If the destination is two directly below its current position and it is in its starting position and there is no piece in its destination
			if (desY == posY + 2  && desX == posX && posY == 1 && board.gameBoard[desY][desX] == null) {
				posX = desX;
				posY = desY;
				return true;
			}
			// If the destination is one diagonally (Down, Left) its current position and there is a white piece in its destination
			if (desY == posY + 1  && desX + 1 == posX && board.gameBoard[desY][desX].team == 'W') {
				posX = desX;
				posY = desY;
				return true;
			}
			// If the destination is one diagonally (Down, Right) its current position and there is a white piece in its destination
			if (desY == posY + 1  && desX  - 1 == posX && board.gameBoard[desY][desX].team == 'W') {
				posX = desX;
				posY = desY;
				return true;
			}
		} else if (this.team == 'W') {
			// If the destination is one directly above its current position and there is no piece in its destination
			if (desY == posY - 1  && desX == posX && board.gameBoard[desY][desX] == null) {
				posX = desX;
				posY = desY;
				return true;
			}
			
			// If the destination is two directly above its current position and it is in its starting position and there is no piece in its destination
			if (desY == posY - 2  && desX == posX && posY == 1 && board.gameBoard[desY][desX] == null) {
				posX = desX;
				posY = desY;
				return true;
			}
						
			// If the destination is one diagonally (Up, Left) its current position and there is a black piece in its destination
			if (desY == posY - 1  && desX + 1 == posX && board.gameBoard[desY][desX].team == 'B') {
				posX = desX;
				posY = desY;
				return true;
			}
			// If the destination is one diagonally (Up, Right) its current position and there is a black piece in its destination
			if (desY == posY - 1  && desX  - 1 == posX && board.gameBoard[desY][desX].team == 'B') {
				posX = desX;
				posY = desY;
				return true;
			}
		}
		return false;
				
	}
	public String toString() {
		return type + "";
		
	}


}
