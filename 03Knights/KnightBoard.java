public class KnightBoard {
    private int[][] board; 
    public int[][] moves;
    public int counter = 0; 

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
	







	int[][] moves = new int[2][8];
	int[] x = {1 , 2 , -1 , -2 , 1 , 2 , -1 , -2};
	int[] y = {2 , 1 , 2 , 1 , -2 , -1, -2 , -1};
	moves[0] = x; 
	moves[1] = y;

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


    public boolean solve(int startingRow , int startingCol) {
	//If the board filled 
	int isFilled = true; 
	for(int counter = 0; counter < board.length - 1; counter ++ ) 
	    {for (int stepper = 0; stepper < board.length - 1; stepper ++) 
		    {if(board[stepper][counter] == 0)  
			    {isFilled = false;}
		    }
	    }
	if(isFilled = true) {return true;}
	
	for(int counter = 0; counter < 
		    
	
		    

}
    

    