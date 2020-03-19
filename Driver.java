import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new scanner object: scan.
		Scanner scan = new Scanner(System.in);
		
		// Declare select integers
		int selectX, selectY;
		
		// Declare destination coordinates
		int desX, desY;
		String end = "";
		// Create new Board object: game.
		Board game = new Board();
		while (end != "YES") {
			// Print out Board
			System.out.println(game);
			
			// Select a piece
			System.out.print("X Coordinate of piece to move:");
			selectX = scan.nextInt();
			
			System.out.print("Y Coordinate of piece to move:");
			selectY = scan.nextInt();
			// Check for piece being there
			if (game.checkForPiece(selectX, selectY)) {
				
				//If piece is there: get destination coordinates and move it
				
				System.out.print("X Coordinate of destination:");
				desX = scan.nextInt();
				
				System.out.print("Y Coordinate of destination:");
				desY = scan.nextInt();
				
				game.movePiece(selectX, selectY, desX, desY);
				
			} else {
				System.out.println("Piece was not found!");
			}
			System.out.print("End the Game? Type YES, otherwise type something else:");
			end = scan.next();
			System.out.println("");
		}
		
	}

}
