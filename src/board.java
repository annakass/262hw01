
public class board {
	public tile9x9 tiles;
	public int[][] board =  new int [9][9];
	
	public board (int[][] input ){
		//use numbers 1 - 9 for reg
		//use 0 if empty
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (input[i][j] <= 9 && input[i][j] >= 1) {
					board[i][j] = input[i][j];
				} 
				else {
					board[i][j] = 0;
				}
			}
		}
	}

}
