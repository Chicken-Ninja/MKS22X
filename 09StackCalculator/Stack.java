import java.util.LinkedList;

public class Stack  
{    
    LinkedList<Double> data;
	public Stack ()
    {
	data = new LinkedList<Double>();
    }
    
    public void push(Double thing)
	
    {
	data.add(thing);
	
    }
    public Double pop ()
    {
	return data.removeLast();
    }
    
    public Double peek() 
    {
	return data.get(data.size()- 1);
    }
    public static void main(String[] args) 
    {
	@SuppressWarnings("unchecked") Stack a = new Stack() ;
	a.push(3.0);
	a.push(4.0);
	a.push(5.0);
	System.out.println(a.peek());
	
	//System.out.println(a.pop());
	//System.out.println(a.pop());
	System.out.println(a.pop());
	System.out.println(a.peek());
	
    }
	
}
    
