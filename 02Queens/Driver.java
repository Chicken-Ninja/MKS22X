public class Driver {
    public static void main(String args[]) {
	QueenBoard a = new QueenBoard(5);
	//a.addQueen(3 , 3);
	System.out.println(a.addQueen(0,2));
	System.out.println(a.addQueen(0,2));
	System.out.println(a.addQueen(0,3));
	System.out.println(a.removeQueen(0,2));
	System.out.println(a.addQueen(3,0));
	System.out.println(a.addQueen(0,0));
	System.out.println(a.removeQueen(3 ,0));
	
	
	System.out.println(a.toString());}
}
			   
			   
			   
