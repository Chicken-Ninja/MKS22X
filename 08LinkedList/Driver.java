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
	//System.out.println(z.toString());
	System.out.println(z.get(0));
	System.out.println(z.get(1));
	
	//System.out.println(z.get(2));
	//System.out.println(z.set(1 , 3)); TESTING SET 
	//System.out.println(z.toString()); TESTING SET 
	//System.out.println(z.indexOf(10));TESTING INDEXOF
	//System.out.println(z.indexOf(11));TESTING INDEXOF
	//System.out.println(z.indexOf(12));TESTING INDEXOF
	//z.clear();
	z.add(12);
	System.out.println(z.toString());
	
	z.clear();
	//.out.println(z.toString());
	z.add(0 , 12);
	z.add(1, 13);
	z.add(0 ,11);
	z.add(1 , 15);
	z.add(0 , 99);
	System.out.println(z.toString());
	z.add(5 , 100);
	System.out.println(z.toString());
	System.out.println(z.get(0));
	System.out.println(z.get(1));
	System.out.println(z.get(2));
	System.out.println(z.get(3));	
	System.out.println(z.get(4));
	System.out.println(z.get(5));
	//System.out.println(z.get(6));
	System.out.println(z.toString());
	System.out.println(z.remove(3));
	
	System.out.println(z.toString());
	System.out.println(z.remove(0));
	System.out.println(z.toString());
	
	
	
	
    }
}
