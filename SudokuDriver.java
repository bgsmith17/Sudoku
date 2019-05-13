
public class SudokuDriver {

	public static void main(String[] args) {
		Sudoku s1 = new Sudoku();
		//Sudoku s2 = new Sudoku();
		
		s1.setPuzzle();
		System.out.println(s1.toString());
		
		//s2.setPuzzle();
		//System.out.println(s2.toString());

		/*System.out.println(Sudoku.equals(s1, s2));
		while(Sudoku.equals(s1, s2)) {
			s2.setPuzzle();
			Sudoku.equals(s1, s2);
		}
		*/
		//System.out.println(s2.toString());
	}

}
