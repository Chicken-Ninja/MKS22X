public class Driver {
    public static void main(String[] args) {
	KnightBoard a = new KnightBoard(5 ,5);
	//System.out.println(a.toString());
	//System.out.println(a.solve(2 , 2));
	System.out.println(a.countSolutions(0,0));
	//System.out.println(a.toString());
	//System.out.println(a.outOfBounds(6,6));
    }

}
 