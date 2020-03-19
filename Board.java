public class Board {
	public Piece[][] gameBoard = new Piece[8][8];
	
	public Board() {
		startGame();
	}
	public void startGame(){
		for (int i = 0; i < gameBoard.length; i++) {
			Pawn genPawn = new Pawn(i, 6, 'W', this);
		}
		for (int i = 0; i < gameBoard.length; i++) {
			Pawn genPawn = new Pawn(i, 1, 'B', this);
		}
		
	}
	
	public void addPiece(int x, int y, Piece piece) {
		gameBoard[y][x] = piece;
	}
	
	public String toString() {
		String temp = "--+----+----+----+----+----+----+----+----+\n";
		temp += "  |0   |1   |2   |3   |4   |5   |6   |7   |\n";
		temp += "--+----+----+----+----+----+----+----+----+\n";
		for (int i = 0; i < gameBoard.length; i++){
			temp += (i) + " |";
			for (int j = 0; j < gameBoard[i].length; j++) {
				temp += gameBoard[i][j]+ "|";
			}
			temp += "\n";
			temp += "--+----+----+----+----+----+----+----+----+\n";
		}
		return temp;
	}
	public boolean checkForPiece(int x, int y){
		if (gameBoard[y][x] != null) {			
			return true;
		}
		return false;
	}
	public void movePiece(int selectX, int selectY, int desX, int desY){
		if (gameBoard[selectY][selectX].canMove(desX, desY, this)) {
			gameBoard[desY][desX] = gameBoard[selectY][selectX];
			gameBoard[selectY][selectX] = null;
		}else {
			System.out.println("You can't move there!");
		}
	}
	
	
}
