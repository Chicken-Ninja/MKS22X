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
    }
}
	//MyLinked a  = new MyLinked() ;
	
	
