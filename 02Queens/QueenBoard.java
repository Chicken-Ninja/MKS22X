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
	    //TOP LEFT
	    
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
	return solveHelper(0 , 0);}

    public boolean solveHelper( int col , int row) {
	

    public int countSolutions() {return 0 ;}
}
