import java.util.LinkedList;

public class Stack <Double> 
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
    public double pop ()
    {
	return data.removeLast();
    }
    
    public double peek() 
    {
	return data.get(data.size()- 1);
    }
}
    
