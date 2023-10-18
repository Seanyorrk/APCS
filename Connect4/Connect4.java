package Connect4;
import java.util.*;
public class Connect4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String board[][] = new String[6][7];
		String turn = "W";  //determines who's turn it is
		int col = -1;
		int moves = 0;
		
		//populate board with "O"
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = "O"; 
			}
		}
		printBoard(board);
		
		char tempChar;
		String tempString;
		//start game
		while (gameOver(board) == false && moves < 42) {			
			do {
				System.out.println("In which column would " + turn + " like to drop the chip? ");
				tempString = input.nextLine();
				if(tempString.length() > 1) {
					col = 8;
				} else {
					tempChar = tempString.charAt(0);
					col = (int)tempChar - 48;
				}
			} while (col > 7 || col < 1 || !board[0][col - 1].equals("O"));
			
			dropChip(board, col - 1, turn);	
			moves++;
			printBoard(board);

			if (gameOver(board)) {
				System.out.println("The game is over! " + turn + " wins");				
			} else if (moves == 42) {
				System.out.println("The game is a tie.");
			}
			
			if (turn.equals("W")) {
				turn = "R";
			} else {
				turn = "W";
			}			
		}
		input.close();
	}
	
	public static void printBoard(String [][] board) {
		System.out.println("1 2 3 4 5 6 7");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
				if (j == board[0].length - 1) {
					System.out.println();
				}
			}
		}
	}
	
	public static boolean gameOver(String[][] board) {
		boolean over = false;
		
		//check vertical wins
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j].equals(board[i + 1][j]) &&
					board[i][j].equals(board[i + 2][j]) &&
					board[i][j].equals(board[i + 3][j]) &&
					!board[i][j].equals("O")) {
					over = true;
				}
			}
		}
		
		//check horizontal wins
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j <= 3; j++) {
				if (board[i][j].equals(board[i][j + 1]) &&
					board[i][j].equals(board[i][j + 2]) &&
					board[i][j].equals(board[i][j + 3]) &&
					!board[i][j].equals("O")) {
					over = true;
				}
			}
		}
		
		//check for diagonal up and to the right
		for (int i = 3; i < board.length; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j].equals(board[i - 1][j + 1]) &&
					board[i][j].equals(board[i - 2][j + 2]) &&
					board[i][j].equals(board[i - 3][j + 3]) &&
					!board[i][j].equals("O")) {
					over = true;
				}
			}
		}
		
		//check for diagonal down and to the right
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j].equals(board[i + 1][j + 1]) &&
					board[i][j].equals(board[i + 2][j + 2]) &&
					board[i][j].equals(board[i + 3][j + 3]) &&
					!board[i][j].equals("O")) {
					over = true;
				}
			}
		}		
		return over;
	}
	
	//drops chip in correct location and updates board
	public static void dropChip(String[][] board, int col, String turn) {
		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][col].equals("O")) {
				board[i][col] = turn;
				i = -1;
			}
		}
	}
}
