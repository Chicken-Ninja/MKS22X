
import java.util.*;
import java.io.*;
public class Maze{

    private char[][]maze;
    private int[] moveX;
    private int[] moveY;
    private boolean animate;//false by default
    //private ArrayList  <String> AMAZEING = new ArrayList <String> ();
    

    /*Constructor loads a maze text file, and sets animate to false by default.

      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - Walls - locations that cannot be moved onto
      ' ' - Empty Space - locations that can be moved onto
      'E' - the location of the goal (exactly 1 per file)
      'S' - the location of the start(exactly 1 per file)

      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds!

      3. When the file is not found OR the file is invalid (not exactly 1 E and 1 S) then: print a meaningful error and exit the program.
    */
    public Maze(String filename){
	
	animate = false; 
	
	try {
	    File file = new File(filename);
	    Scanner b = new Scanner(file);
	    String values = b.nextLine();
	    int a = values.length();
	    // int[][] moveBank = new int[2][4];
	    int[] x = {-1 , 0 , 0 ,1};
	    int[] y ={0, -1 , 1 , 0};
	    moveX = x;
	    moveY = y;
	    
	    
			    

	    while(b.hasNextLine())
		{
		    values = values + b.nextLine();
		}
	    
	    maze = new char[values.length() / a][a];
	    
	    for(int counter = 0; counter < values.length(); counter++)
		{
		    maze[counter/a][counter%a] = values.charAt(counter);
		}
	    
	    int SCount = 0;
	    int ECount = 0;
	    
	    for(int counter = 0 ; counter < maze.length; counter++ ) 
		{
		    for(int stepper = 0; stepper < maze.length; stepper++ )
			{
			    if(maze[stepper][counter] == 'C')
				{
				    SCount ++;
				}
			    if(maze[stepper][counter] == 'E')
				{
				    ECount ++;
				}
			}
		}
	    
	    if(ECount != 1 && SCount != 1)
		{
		    throw new IllegalStateException();
		}
	    if(ECount > 1 && SCount >1)
		{
		    throw new IllegalStateException();
		}
	    
	}
	catch(FileNotFoundException e)
	    {
		e.printStackTrace();
	    }
    }
		
    public String toString()
    {
	String dump = "";
	for(int counter = 0; counter < maze.length; counter++ )
	    {
		//System.out.println("Woot");
		for(int stepper = 0; stepper < maze[0].length; stepper++)
		    {
			//	System.out.println("Whoot");
			dump += maze[counter][stepper];
			dump += " ";
		    }
		dump += "\n";
	    }
	return dump;
    }
		    


		

        //COMPLETE CONSTRUCTOR
    
    
    private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }

    public void setAnimate(boolean b){
        animate = b;
    }

    public void clearTerminal(){
        //erase terminal, go to top left of screen.
        System.out.println("\033[2J\033[1;1H");
    }


    /*Wrapper Solve Function returns the helper function
      Note the helper function has the same name, but different parameters.
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.
    */
    public int solve(){ 
	int SCol = 0;
	int SRow = 0;

	System.out.println("Yo");
	for( int counter =  0; counter < maze.length; counter++ ) 
	    {
		for(int stepper = 0; stepper < maze[0].length; stepper++)
		    {
			if(maze[counter][stepper] == 'S')
			    {
				SCol = stepper;
				SRow = counter;
			    }
		    }
	    }
	System.out.println(SRow + " " + SCol);
	maze[SRow][SCol] = ' ';
	System.out.println("Hey");
	return solveH(SCol , SRow, 0);
	
    }
    public int solveH(int col , int row , int count) 
    {
	if(maze[row][col] == 'E')
	    {
		return count; 
	    }
	maze[row][col] = '@';
	System.out.println(toString());
	for(int counter = 0 ; counter < 4; counter++ ) 
	    {	
		try {
		    if(maze[row + moveX[counter]][col + moveY[counter]] == ' ' || maze[row + moveX[counter]][col + moveY[counter]] == 'E')
			{
			   
			    int temporary = solveH(col + moveY[counter], row + moveX[counter] , count + 1);
			    
			    if(temporary != -1)
				{
				    return temporary; 
				}
			    maze[row][col] = ' ';
			}
		}
		catch(IndexOutOfBoundsException e)
		    {}
	    }
	for(int counter =  0; counter < 4; counter++ ) 
	    {
		if(maze[row + moveX[counter]][col + moveY[counter]] == '@')
		    {
			maze[row][col] = '.';
			maze[row + moveX[counter]][col + moveY[counter]] = ' ';
			return solveH(row + moveX[counter] , col + moveY[counter] , count - 1);
		    }
	    }

	
	return -1;
    
	
    }	  
 
    
	
			
            //find the location of the S. 

            //erase the S

            //and start solving at the location of the s.
            //return solve(???,???);


    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns the number of @ symbols from S to E when the maze is solved,
      Returns -1 when the maze has no solution.

      Postcondition:
        The S is replaced with '@' but the 'E' is not.
        All visited spots that were not part of the solution are changed to '.'
            Note: This is not required based on the algorithm, it is just nice visually to see.
        All visited spots that are part of the solution are changed to '@'
    */
   //you can add more parameters since this is private

        //automatic animation! You are welcome.
       

        //COMPLETE SOLVE
       //so it compiles
    





    public static void main (String[] args) 
    {
	Maze a = new Maze("TestMaze1.txt");
	System.out.println(a.toString());
	System.out.println(a.solve());
	

    }
}


