public class KnightBoard {
    private int[][] board; 
    public int[][] moves = [ [


    public KnightBoard (int rows , int cols) {

	if(cols <= 0 || rows <= 0) {
	    throw new IllegalArgumentException();
	}
	
	board = new int[rows + 1][cols + 1];
	for(int counter = 0; counter <= cols; counter ++ ) 
	    {for(int stepper = 0; stepper <= rows; stepper++) 
		    {
			board[stepper][counter] = 0;
		    }
	    }
    }
    public String toString() {
	String dump = ""; 
	for(int counter = 0; counter < board[0].length - 1; counter ++ ) 
	    {
	    for(int stepper = 0; stepper < board.length - 1;stepper ++ ) 
		{
		    if(board[counter][stepper] < 0) 
			{throw new IllegalArgumentException();}
		    if(board[counter][stepper] == 0) {dump = dump + "_";}
		    dump += " ";
		    
		}
	    dump = dump + "\n"; 
	    }
	return dump;
    }
    public boolean solve(int startingRow , int startingCol) {} 
		    
  
}
    

    