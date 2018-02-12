public class QueenBoard {
    private int[][] board ;
    public QueenBoard(int size) {
	board = new int[size][size];}

    public /*PRIVATE */  boolean addQueen( int r , int c) {
	if(board[r][c] > 0){ return false; }
	if(board[r][c] < 0) {return false; }
	else {board[r][c] = -1;
	    for(int counter = c + 1; counter < board.length; counter ++) {
		board[r][counter] += 1;}
	    //(UP) HORIZONTAL
	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++) {
		board[r + counter][c + counter] += 1;}
	    //BOTTOM RIGHT 
	    
	    return true; }
	
    }

    public boolean removeQueen(int r , int c) {
	if(board[r][c] >= 0) {return false;}
        else{board[r][c] = 0;
	    for(int counter = c + 1; counter < board.length; counter ++ ) {
		board[r][counter] -=1;}
	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++ ) {
		board[r+counter][c+counter] -=1;}
	    
	    return true;}
    }


    public String toString() {

	String dump = ""; 
	for( int counter = 0; counter < board.length; counter++ )
	    {for( int stepper = 0; stepper < board.length; stepper++ ) {
		    if(board[counter][stepper] < 0) {dump = dump + " " + "Q";}
		    //if(board[counter][stepper] >= 1) {dump = dump + " " + "X";}
		    else if(board[counter][stepper] >= 0) {dump = dump + " " + "_"; }}
		    dump = dump + '\n' ;}
		return dump; 
    }
    
		   

    public boolean solve() {
	if (solveHelper(0) == true) {return true;}
	else{
	    for(int counter = 0; counter < board.length; counter ++ )
		for(int stepper = 0; stepper < board.length; stepper ++ )
		    board[stepper][counter] = 0;
	    return false; }
    
    }

    public boolean solveHelper( int col ) {
	if(col == board.length) {return true;}
	for(int counter = 0; counter < board.length; counter ++ ) {
	    
	    if(addQueen(counter , col)) {
		if(solveHelper(col + 1)) {return true;}
	    }
	    else if(counter == board.length) {
		removeQueen(counter , col);
		return false;}
	    else{removeQueen(counter, col);
		
	    
		
	    }}
	return true;}
	    
	    
	    
	
    

		

    public int countSolutions() {return 0 ;}
}
