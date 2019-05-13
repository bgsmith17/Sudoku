import java.util.*;

public class Sudoku {
	// instance variable, each instance of Sudoku will contain a puzzle.
	private Row[] puzzle;

	/**
	 * enumeration which contains all possible values for a sudoku puzzle
	 * 
	 * @author bryan
	 *
	 */

	/**
	 * puzzle constructor
	 * 
	 */
	public Sudoku() {
		this.puzzle = new Row[9];
	}

	/**
	 * puzzle setter
	 * 
	 */
	// need to finish equals method to check for row equality to generate 10 unique
	// rows.
	public void setPuzzle() {
		int counter = 0;
		boolean unique = false;
		while (counter < puzzle.length) {
			Row rowMe = new Row();
			puzzle[0] = rowMe;
			unique = false;
			for (int i = 0; i < puzzle.length; i++) {
				while (!unique) {
					rowMe = new Row();
					for (int j = 0; j < puzzle.length; j++) {
						if (puzzle[j] == null) {
							break;
						} 
						else if (puzzle[j].equals(rowMe)) {
							break;
						} 
						else {
							puzzle[counter] = rowMe;
							counter++;
							unique = true;
						}
					}
				}
			}
		}
	}

	/*
	 * public void setPuzzle() { boolean placed = false; int value = 0; for(int row
	 * = 0; row < puzzle.length;row++) { for(int col = 0; col <
	 * puzzle[row].length;col++) { placed = false; value = Values.getRandomValue();
	 * while(!placed) { if(occursNumberOfTimes(value) > 0) { value =
	 * Values.getRandomValue(); } else { puzzle[row][col] = value; placed = true; }
	 * }//while!placed }//forcol }//forrow }//setpuzzle
	 */
	/**
	 * prints the puzzle
	 * 
	 */
	public String toString() {
		String arrayString = "";
		if (this.puzzle != null && !this.isEmpty()) {
			for (Row row : puzzle) {
				arrayString += row.toString() + "\n\n";
			}
		}
		return arrayString;
	}

	/**
	 * checks that each number only appears once in a given row
	 * 
	 * @param value
	 * @return
	 */
	/*
	 * private int occursNumberOfTimes(int value) { int frequency = 0; int i= 0;
	 * for(int row = i; row < this.puzzle.length; row++) { for(int col = 0; col <
	 * this.puzzle.length;col++) { if(this.puzzle[row] == null) { break; }
	 * if(this.puzzle[row][col] == value) { frequency ++; } i++; } } return
	 * frequency; }
	 */
	public boolean isEmpty() {
		return this.puzzle.length == 0;
	}

	// solve this
	/*
	 * public boolean equals(int[][] s) { for(int row = 0; row < puzzle.length;
	 * row++) { if (this.puzzle[row][row]) {} }
	 * 
	 * }
	 */
	public Row[] getPuzzle() {
		return this.puzzle;
	}
}
