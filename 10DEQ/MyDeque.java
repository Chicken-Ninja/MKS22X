import java.util.*;

public class MyDeque<E> {

    private E[] data;
    private int length;
    private int first;
    private int last;
    

    @SuppressWarnings("unchecked")
    public MyDeque (int capacity)
    {
	if(capacity < 0 )
	    {
		throw new IllegalArgumentException();
	    }
	
	data = (E[])new Object[capacity];
	length = capacity;
	first = 0;
	last = capacity;
	
    }
    
    @SuppressWarnings("unchecked")
    public MyDeque ()
    {
	data = (E[])new Object[10];
	length = 10;
	first = 0;
	last = 10;
	
	
    }

    public int size()
    {
	return length;
    }

    public void addFirst(E thing)
    {

	if(thing == null)
	    {
		throw new IllegalArgumentException();
	    }
	

	
	       
	
        else if(first == 0 && isFull() == false)
	    {
		data[length] = thing;
		first = length; 
	    }
	else if(isFull() == false)
	    {
		data[first - 1] = thing;
		first = first - 1;
	    }

    }

    public void addLast(E thing)
    {
	if(thing == null)
	    {
		throw new IllegalArgumentException();
	    }
	else if(last == length && isFull() == false)
	    {
		data[0] = thing;
		last = 0; 
	    }
	else if(isFull() == false) 
	    {
		data[last + 1] = thing;
		last = last + 1; 
	    }
    }

    public E removeFirst()
    {
	E temp = data[0];
	if(isEmpty() == true)
	    {
		throw new NoSuchElementException();
	    }
	else if(first == length)
	    {
		temp = data[first];
		data[first] = null;
		first = 0; 
	    }
	return temp;
    }

    public E removeLast() 
    {
	E temp = data[0];
	if(isEmpty() == true)
	    {
		throw new NoSuchElementException();
	    }
	else if(last == 0) 
	    {
		temp = data[last];
		data[last] = null;
		last = length; 
	    }
	return temp;
    }
	
    public E getFirst()
    {
	if(isEmpty()) 
	    {
		throw new NoSuchElementException();
	    }
	else
	    {
		return data[first];
	    }
    }
    
    public E getLast()
    {
	if(isEmpty())
	    {
		throw new NoSuchElementException();
	    }
	else
	    {
		return data[last];
	    }
    }
	     






	
		

		
	
		
    public boolean isEmpty() 
    {
	for(int counter = 0; counter <= length; counter++ ) 
	    {
		if(data[counter] != null) 
		    {
			return false;
		    }
	    }
	return true; 
    }


    
	

    public boolean isFull()
    {
	for (int counter = 0; counter <= length; counter++ )
	    {
		if(data[counter] == null)
		    {
			return false;
		    }
	    }
	return true;
    }
}
		   
    
    
    /*@SuppressWarnings("unchecked")
    /*public void resize()
    {
	data = (E[])new Object[length * 2];
	///length = length * 2;
	for(int counter = 0; counter <= length; counter++)
	    {
		
	    
    

    
    
	    }*/
    
