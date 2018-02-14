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
	    //(UP) right 
	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++) {
		board[r + counter][c + counter] += 1;}
	    //up down
	    for(int counter = 1; c + counter < board.length  && r - counter > 0; counter++ ) {
		board[r - counter][c + counter] += 1;}
	    //up right 
	    for(int counter = r - 1; counter > 0; counter-- ) {
		board[counter][c] += 1;}
	    //up
	    for(int counter = c - 1; counter > 0; counter -- ) {
		board[r][counter] += 1;}
	    //left
	    for(int counter = 1; c + counter < board.length && r + counter < board.length; counter++ ) {
		board[r + counter][c+ counter] += 1;}
	    //down right
	    for(int counter = r + 1; counter < board.length; counter ++ ) {
		board[counter][c] += 1;}
		
	    //up right
	    for(int counter = 1; c - counter > 0 && r + counter < board.length; counter++ ) {
		board[r + counter][c - counter] += 1;}
	    //bottom left 
	    // for(int counter = c - 1; counter > 0; counter++ ) {
	    //	board[counter][c];}
	    //for(int counter = r - 1; counter < board.length; counter++ ) {
	    //		board[counter][c];}
	    // for(int counter = r - 1; counter < board.length; counter++ ) {
	    //board[counter][c];}


	    //BOTTOM RIGHT 
	    
	    return true; }}
	


    public boolean removeQueen(int r , int c) {
	if(board[r][c] >= 0) {return false;}
        else{board[r][c] = 0;
	    for(int counter = c + 1; counter < board.length; counter ++) {
		board[r][counter] -= 1;}
	    //(UP) right 
	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++) {
		board[r + counter][c + counter] -= 1;}
	    //up down
	    for(int counter = 1; c + counter < board.length  && r - counter > 0; counter++ ) {
		board[r - counter][c + counter] -= 1;}
	    //up right 
	    for(int counter = r - 1; counter > 0; counter-- ) {
		board[counter][c] -= 1;}
	    //up
	    for(int counter = c - 1; counter > 0; counter-- ) {
		board[r][counter] -= 1;}
	    //left
	    for(int counter = 1; c + counter < board.length && r + counter < board.length; counter++ ) {
		board[r + counter][c+ counter] -= 1;}
	    //down right
	    for(int counter = r + 1; counter < board.length; counter ++ ) {
		board[counter][c] -= 1;}
	    //up right
	    for(int counter = 1; c - counter > 0 && r + counter < board.length; counter++ ) {
		board[r + counter][c - counter] -= 1;}
	    //down left
	    
	    
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
    public void reset() {
	for(int counter = 0; counter < board.length; counter ++ ) {
	    for( int stepper = 0; stepper < board.length; stepper++) {
		removeQueen(stepper , counter);
	    }
	}
    }
    
		   

    public boolean solve() {
		boolean dump = false; 
	for(int counter = 0; counter < board.length; counter++ ) {
	    for(int stepper = 0; stepper < board.length; stepper ++) {
		addQueen(stepper , counter);
		if(solveHelper(0 , 0)) {return true;}
		else{reset();}
	    }
	}
	return dump;
    }
										       




	/*boolean dump = false;
	for(int counter = 0; counter < board.length; counter ++) {
	    for(int stepper = 0; stepper < board.length; stepper++ ) {
		dump = dump || solveHelper(stepper , counter);
		if(dump == true) {return true;}
		for(int bla = 0; bla < board.length;bla ++ ) {
		    for(int bleh = 0; bleh < board.length; bleh ++ )
			removeQueen(bla , bleh);}}
	}
	return dump;
	}*/
	   



	
       
    


    public boolean solveHelper( int row , int col ) {
	//if(col == board.length && row == board.length) {if(addQueen(row , col) == false){return false;}
	//   else{return true;}}
	if(board[row][col] == -1) {return solveHelper(0 , col + 1);}
	if(col == board.length - 1 && addQueen(row , col) ) {return true;} 
	
	if(addQueen(row ,col)) {
	    System.out.println(toString());
	    return solveHelper(0 , col + 1);}
	
	else{if(row == board.length - 1 && addQueen(row , col) == false) {return false;}
	    System.out.println(toString());
	    return solveHelper(row + 1, col);}
    
		
    
    }
	




/*	if(col <= board.length - 1) {
	for(int counter = 0; counter < board.length; counter ++ ) {
	    if(counter == board.length && addQueen(counter, col) == false) {return false;} 
	    else {addQueen(counter , col);
		return solveHelper(col + 1);}
	    //   if(addQueen(counter , col)) {
	    //if(solveHelper(col + 1)) {return true;}
	    //}
	    // else if(counter >= board.length) {
	    //    {return false;}
	    // }
	    //	}
		
	}
	}return true;
	}*/ 

		
	
	
	
	    
	    
	    
	
    

		

    public int countSolutions() {return 0 ;}
}
