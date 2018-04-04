public class Driver
{
    public static void main(String args[] )
    {
	Node b = new Node(null, null, 13);
	Node c = new Node(b , null , 12);
	Node d = new Node(null, b , 14);
	b.setNext(d);
	System.out.println(c.toString() + b.toString() + d.toString());
	System.out.println(c.toString() + c.getNext().toString() + b.getNext().toString());
    

	MyLinked z  = new MyLinked() ;
	z.add(10);
	z.add(11);
	z.add(12);
	System.out.println(z.toString());
	System.out.println(z.get(0));
	System.out.println(z.get(1));
	
	System.out.println(z.get(2));
	//System.out.println(z.set(1 , 3)); TESTING SET 
	//System.out.println(z.toString()); TESTING SET 
	//System.out.println(z.indexOf(10));
	System.out.println(z.indexOf(11));
	System.out.println(z.indexOf(12));
	
	
    }
}
