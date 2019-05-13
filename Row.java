import java.util.Random;

public class Row {
	private int[] row;
	
	private enum Values{
		ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
		
		/**constructor for the enumerated values
		 * 
		 */
		private int numVal;
		private Values(int numVal) {
			this.numVal = numVal;
		}
		/**method to get a random value from the enumeration
		 * 
		 * @return
		 */
		public static int getRandomValue() {
			Random random = new Random();
			return values()[random.nextInt(values().length)].numVal;
		}
	}

	
	public Row() {
		this.row = new int[9];
		boolean placed;
		int value;
		for(int row = 0; row < this.row.length; row++) {
			placed = false;
			value = Values.getRandomValue();
			while(!placed) {
				if(occursNumberOfTimes(value) > 0) {
					value = Values.getRandomValue();
				}
				else {
					this.row[row] = value;
					placed = true;
				}		
			}
		}
	}
	private int occursNumberOfTimes(int value) {
		int frequency = 0;
		for(int i= 0; i < this.row.length; i++) {
			if(this.row == null) {
				break;
			}
			if(this.row[i] == value) {
				frequency ++;	
			}
		}
		return frequency;
	}
	public String toString() {
		String rowString = "[";
		for(int i = 0; i < row.length; i++) {
			if (i < row.length -1) {
				rowString += row[i]+ "   ";
			}
			else {
				rowString += row[i];
			}
		}
		rowString += "]";
		return rowString;
	}
	
	public boolean equals(Row r) {
		for(int i = 0; i < row.length; i ++) {
			if(this.row[i] == r.row[i]){
				return true;
			}
		}
		return false;
	}
}



