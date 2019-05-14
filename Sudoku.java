import java.util.*;

public class Sudoku {
	private int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private int[] placed = new int[9];
	private int[][] board;

	public Sudoku() {
		this.board = new int[9][9];
		placeNumber(numbers);
	}

	private void placeNumber(int[] num) {
		int index, row, col, value = -1, count = 0, valPlaced = 0;
		boolean placed = false;
		while (valPlaced <= 9) {
			index = (int) (Math.random() * 8);
			count = 0;
			while (count <= 9) {
				value = numbers[index];
				if(placed(value)) {
					//code for if value is in placed array
				}
				row = (int) (Math.random() * 9);
				col = (int) (Math.random() * 9);
				if (this.board[row][col] == 0) {
					this.board[row][col] = value;
					count++;
				} else {
					break;
				}
			}
			valPlaced++;
		}
	}
	private boolean inCol(int col) {
		for(i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board[i].length; j++) {
				if (this.board[i][j] ==)
			}
		}
		return false;
		
	}
	private boolean placed(int value) {
		return false;
	}
	private boolean inRow() {
		return false;
	}
	private boolean inBox() {
		return false;
	}

	/**
	 * Prints the Sudoku board
	 * 
	 */
	public String toString() {
		String boardString = "[";
		for (int i = 0; i < board.length; i++) {
			if (i > 0) {
				boardString += "\n\n[";
			}
			for (int j = 0; j < board[i].length; j++) {
				if (j < board.length - 1) {
					boardString += board[i][j] + "   ";
				} else {
					boardString += board[i][j] + "]";
				}
			}
		}
		return boardString;
	}
}
