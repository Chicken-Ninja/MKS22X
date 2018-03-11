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
	for(int counter = 0; counter < moves[0].length - 1; counter ++ ) 
	    {
	    for(int stepper = 0; stepper < moves.length - 1;stepper ++ ) 
		{
		    if(moves[counter][stepper] < 0) 
			{throw new IllegalArgumentException();}
		    dump += moves[counter][stepper];
		    //if(board[counter][stepper] == 0) {dump = dump + "_";}
		    //else{dump = dump + board[counter][stepper];}
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

    public boolean isFilled() {
	for(int counter = 0; counter < board.length - 1; counter++ ) 
	    {for(int stepper = 0; stepper < board[0].length - 1; stepper ++) 
		    {if( board[counter][stepper] == 0) {return false;}
		    }
	    }
	return true;
    }


    public boolean solve(int startingRow , int startingCol) {
	

	if(isFilled()) {return true;} 
	
	



	if(board[startingRow + moves[0][0]][startingCol + moves[0][1]] != 0 &&
	   board[startingRow + moves[1][0]][startingCol + moves[1][1]] != 0 &&
	   board[startingRow + moves[2][0]][startingCol + moves[2][1]] != 0 &&
	   board[startingRow + moves[3][0]][startingCol + moves[3][1]] != 0 &&
	   board[startingRow + moves[4][0]][startingCol + moves[4][1]] != 0 &&
	   board[startingRow + moves[5][0]][startingCol + moves[5][1]] != 0 &&
	   board[startingRow + moves[6][0]][startingCol + moves[6][1]] != 0 &&
	   board[startingRow + moves[7][0]][startingCol + moves[7][1]] != 0 )
	    {return false;}

	else{
	    for(int counter = 0; counter < moves.length - 1; counter ++ )
		{if(!outOfBounds(startingRow + moves[counter][0] , startingCol + moves[counter][1]))
			{
			    if(board[startingRow + moves[counter][0]][startingCol + moves[counter][1]] == 0)
				{
				    board[startingRow + moves[counter][0]][startingCol + moves[counter][1]] = moof;
				    moof +=1;
				    
				    if(solve(startingRow + moves[counter][0] , startingCol + moves[counter][1]))
				{return true;}
				    else{board[startingRow + moves[counter][0]][startingCol + moves[counter][1]] = 0;}
			}
			}
	}
	     
	}
	return true;
    }
}
    
				   
    






	    /*if(startingRow + moves[0][counter] > board.length - 1 && startingRow + moves[1][counter] < 0 && startingCol + moves[1][counter] > board[0].length - 1 &&  startingCol + moves[1][counter] < 0) 
		//{return false;} 
	    //if(outOfBounds(startingRow + moves[0][counter] ,startingCol + moves[1][counter])) 
	    	{System.out.println("OUTOFBOUNDS");
		    return false;}
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
    }*/
    

    
