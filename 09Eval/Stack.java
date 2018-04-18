import java.util.LinkedList;

public class Stack <T> 
{    
    LinkedList<T> data;
	public Stack ()
    {
	data = new LinkedList<T>();
    }
    
    public void push(T thing)
	
    {
	data.add(thing);
	
    }
    public T pop ()
    {
	return data.removeLast();
    }
    
    public T peek() 
    {
	return data.get(data.size());
    }
}
    