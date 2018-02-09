public class QueenBoard {
    private int[][] board ;
    public QueenBoard(int size) {
	board = new int[size][size];}

    public /*PRIVATE */  boolean addQueen( int r , int c) {
	if(board[c][r] > 0){ return false; }
	if(board[c][r] < 0) {return false; }
	else {board[c][r] = -1;
	    for(int counter = c; counter < board.length; counter ++) {
		board[counter][r] += 1;}
	    //(UP) HORIZONTAL
	    for(int counter = r; counter < board[0].length; counter ++) {
		board[c][counter] += 1;}
	    //VERTICAL
	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++) {
		board[r + counter][c + counter] += 1;}
	    //BOTTOM RIGHT 
	    for(int counter = 1; r + counter < board.length && c - counter > 0; counter ++) {
		board[r + counter][c - counter] += 1;}
	    //BOTTOM LEFt
	    for(int counter = 1; r - counter > 0 && c + counter > board.length; counter++) {
		board[r - counter] [c + counter] +=1;}
	    //TOP RIGHT 
	    for(int counter = 1; r - counter > 0 && c - counter > 0; counter ++ ) {
		board[r-counter] [c-counter] +=1;}
	    //TOP LEFT
	    return true; }
	
    }

    private boolean removeQueen(int r , int c) {
	if(board[c][r] >= 0) {return false;}
        else{board[c][r] = 0;
	     for(int counter = c; counter < board.length; counter ++) {
		board[counter][r] -= 1;}
	    //(UP) HORIZONTAL
	    for(int counter = r; counter < board[0].length; counter ++) {
		board[c][counter] -= 1;}
	    //VERTICAL
	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++) {
		board[r + counter][c + counter] -= 1;}
	    //BOTTOM RIGHT 
	    for(int counter = 1; r + counter < board.length && c - counter > 0; counter ++) {
		board[r + counter][c - counter] -= 1;}
	    //BOTTOM LEFt
	    for(int counter = 1; r - counter > 0 && c + counter > board.length; counter++) {
		board[r - counter] [c + counter] -=1;}
	    //TOP RIGHT 
	    for(int counter = 1; r - counter > 0 && c - counter > 0; counter ++ ) {
		board[r-counter] [c-counter] -=1;}
	    //TOP LEFT
	    
	    return true;}
    }


    public String toString() {
	String dump = ""; 
	for( int counter = 0; counter < board.length; counter++ )
	    {for( int stepper = 0; stepper < board.length; stepper++ ) {
		    if(board[counter][stepper] == -1) {dump = dump + " " + "Q";}
		    else{dump = dump + " " + "_"; }
		    dump = dump + "/n" ;}}
		return dump; 
    }
    
		   

    public boolean solve() {return true; }

    public int countSolutions() {return 0 ;}
}
