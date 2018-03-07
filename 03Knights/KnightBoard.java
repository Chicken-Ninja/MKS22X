public class KnightBoard {
    private int[][] board; 
    public int[][] moves;
    public int moof = 1; 

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
		    else{dump = dump + board[counter][stepper];}
		    dump += " ";
		    
		}
	    dump = dump + "\n"; 
	    }
	return dump;
    }

    public boolean outOfBounds(int startingRow, int startingCol) {
	try{board[startingRow][startingCol] += 0;} 
	catch(ArrayIndexOutOfBoundsException e) {return true;} 
	return false;
    }


    public boolean solve(int startingRow , int startingCol) {
	//If the board filled 
	Boolean isFilled = true; 
	for(int counter = 0; counter < board.length - 1; counter ++ ) 
	    {for (int stepper = 0; stepper < board.length - 1; stepper ++) 
		    {if(board[stepper][counter] == 0)  
			    {isFilled = false;} 
				
		    }
	    }
	System.out.println(isFilled); 
    
	if(isFilled == true) {return true;}
	else{
	for(int counter = 0; counter < moves.length - 1; counter ++ ) {
	    if(startingRow + moves[0][counter] > board.length - 1 || startingRow + moves[1][counter] < 0 || startingCol + moves[1][counter] > board[0].length - 1 ||  startingCol + moves[1][counter] < 0) 
		//{return false;} 
	    //if(outOfBounds(startingRow + moves[0][counter] ,startingCol + moves[1][counter])) 
	    	{System.out.println("OUTOFBOUNDS");}
	    else if (board[startingRow  + moves [0][counter]][startingCol + moves[1] [counter]] != 0) 
		{System.out.println("TAKEN");}
	    else if (board[startingRow + moves[0][counter]] [startingCol + moves[1][counter]] == 0)
		{
		    board[startingRow + moves[0][counter]] [startingCol + moves[1][counter]] = moof;
		    moof += 1;
		    if(solve(startingRow + moves[0][counter] , startingCol + moves[1][counter]) == false) {
		    board[startingRow + moves[0][counter]] [startingCol + moves[1][counter]] = 0;}
		    else{return true;}
		
		}
	}
	
	    
	
	
		    

	}
	return false;
    }
}
    

    