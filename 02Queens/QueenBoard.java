public class QueenBoard {
    private int[][] board ;
    // public int dump = 0; 
    public QueenBoard(int size) {
	board = new int[size][size];}

    public boolean addQueen( int r , int c) {
	if(board[r][c] > 0){ return false; }
	if(board[r][c] < 0) {return false; }
	else {board[r][c] = -1;
	    for(int counter = c + 1; counter < board.length; counter ++) {
		board[r][counter] += 1;}
	    // right 

	    for(int counter = 1; r + counter < board.length && c + counter < board.length; counter ++) {
		board[r + counter][c + counter] += 1;}
	    //down right

	    for(int counter = 1; c + counter < board.length  && r - counter >= 0; counter++ ) {
		board[r - counter][c + counter] += 1;}
	    //up right 

	    for(int counter = r - 1; counter >= 0; counter-- ) {
		board[counter][c] += 1;}
	    //up

	    for(int counter = c - 1; counter >= 0; counter -- ) {
		board[r][counter] += 1;}
	    //left

	    for(int counter = 1; c - counter >= 0 && r - counter >= 0; counter++ ) {
		board[r - counter][c - counter] += 1;}
	    //up left

	    for(int counter = r + 1; counter < board.length; counter ++ ) {
		board[counter][c] += 1;}
	    // down

	    for(int counter = 1; c - counter >= 0 && r + counter < board.length; counter++ ) {
		board[r + counter][c - counter] += 1;}
	    //down left 

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
	    for(int counter = c + 1; counter < board.length ; counter ++) {
		board[r][counter] -= 1;}
	    //(UP) right
 
	    for(int counter = 1; r + counter < board.length  && c + counter < board.length ; counter ++) {
		board[r + counter][c + counter] -= 1;}
	    //down right

	    for(int counter = 1; c + counter < board.length   && r - counter >= 0; counter++ ) {
		board[r - counter][c + counter] -= 1;}
	    //up right 

	    for(int counter = r - 1; counter >= 0; counter-- ) {
		board[counter][c] -= 1;}
	    //up

	    for(int counter = c - 1; counter >= 0; counter-- ) {
		board[r][counter] -= 1;}
	    //left

	    for(int counter = 1; c - counter >= 0  && r - counter >= 0; counter++ ) {
		board[r - counter][c- counter] -= 1;}
	    //up left 

	    for(int counter = r + 1; counter < board.length; counter ++ ) {
		board[counter][c] -= 1;}
	    //down 

	    for(int counter = 1; c - counter >= 0 && r + counter < board.length; counter++ ) {
		board[r + counter][c - counter] -= 1;}
	    //down left
	    
	    
	    return true;}
    }


    public String toString() {

	String dump = ""; 
	for( int counter = 0; counter < board.length; counter++ )
	    {for( int stepper = 0; stepper < board.length; stepper++ ) {
		    if(board[counter][stepper] < 0) {dump = dump + " " + "Q";}
		    if(board[counter][stepper] >= 1) {dump = dump + " " + "X";}
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
	    //System.out.println(toString());
	    return solveHelper(0 , col + 1);}
	
	else if(row == board.length - 1 && addQueen(row , col) == false) {return false;}
	    //System.out.println(toString());
	else{    return solveHelper(row + 1, col);}}
    
		
    

	




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

		
	
	
	
	    
	    
	    
	
    

		

    public int countSolutions() {
	
	return countHelper(0 , 0);
    }



      public int countHelper( int row , int col ) {
	  //System.out.print(row);
	  //System.out.println(" " + col);
	  //System.out.println(toString());
	  int dump = 0;
	  if( col == board.length - 1) {
	      if( row == board.length - 1) {
		  if(addQueen(row , col)) {
		      dump += 1;
		      removeQueen(row , col);
		      return dump;
		  }
		  if(!addQueen(row , col)) {
		      return dump;
		  }
	      }
	      else{
		  if(addQueen(row , col)) {
		      dump += 1;
		      removeQueen(row , col); 
		      return countHelper(row + 1 , col) + dump;
		  }
		  if(!addQueen(row , col)) {
		      return countHelper(row + 1, col) + dump;
		  }
	      }
	  }
	  else{
	      if(row == board.length - 1 && addQueen(row, col)) {
		  int nextCol = countHelper(0, col+1);
		  removeQueen(row, col);
		  return nextCol + dump;
	      }
	      if(row == board.length - 1 && !addQueen(row , col)) {
		  return 0 + dump; 
	      }
	      else {
		  if(addQueen(row ,col)){
		      int nextCol = countHelper(0 , col + 1);
		      removeQueen(row, col);
		      int nextRow = countHelper(row + 1 , col); 
		      return nextCol + nextRow + dump;
		  }
		  if(!addQueen(row , col)) {
		      return countHelper(row + 1, col) + dump;
		  
		  }
	      }
		  //}
	  }
	  reset();
	  return dump; 
      }

}       
	  
	 	 
	  









/*	  if(col == board.length - 1 && row == board.length - 1 && addQueen(row , col)) 
	      {dump += 1;
		  removeQueen(row , col); }
	      
	  else if(col == board.length - 1 && addQueen(row , col)){
	      dump += 1; 
	      removeQueen(row , col); 
	      countHelper(row + 1, col);}
	 
	  else if(col < board.length - 1) {
	      boolean thing = false; 
	      for(int counter = 0; counter <= board.length - 1 ; counter++) {
		  if(counter == board.length - 1 && addQueen(counter, col))
		      {thing = thing || true;
			  countHelper(0 , col + 1);}
		  if(counter == board.length - 1 && !addQueen(counter ,col) && thing == false){
		      break;}
	      
		  
		      
		  else if(addQueen(counter, col)){
		      thing = thing || true; 
		      countHelper(0 , col + 1); 
		      removeQueen(counter, col);}
	      
		  System.out.println(toString());
	      }
	  }
	  //System.out.println(toString());
	  return dump;}
}
	      // System.out.println(toString());
	
	      */
	      
	      
	      
	  
	
		  
	      
	  
      
      
	











	  /*if( col == board.length - 1 && row == board.length - 1 && addQueen(row , col)) {yeet = true;
	      dump += 1;
	      System.out.println(toString());}
	  if( col == board.length - 1 && addQueen(row , col)) {dump += 1;
	      yeet = true; 
	      System.out.println(toString());
	      removeQueen(row , col);
	      countHelper(row + 1, col);
	  }
	  else{
	  for(int counter = 0; counter < board.length - 1; counter ++) {
	      if(addQueen(counter , col)){
		  countHelper(0 , col + 1);
		  // System.out.println(toString());
		  if(yeet == false) {removeQueen(counter , col);}
	      }yeet = false; }
	  return dump;}
	  return 694;}	      
	  */
	  
    

