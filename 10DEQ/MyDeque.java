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
	length = capacity - 1;
	first = 0;
	last = capacity - 1;
	
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
	else
	    {
		temp = data[first];
		data[first] = null;
		first = first + 1; 
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
	else
	    {
		temp = data[last];
		data[last] = null;
		last = last - 1;
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
	     





    /*  public void resize() 
    {
	int E[] temp = new int E[length * 2];
	if(first > last) 
	    {
		int size = length; 
		int tempValues = 0; 
		int dataValues = first; 
		while(stepper <= length)
		    {
			if(stepper == length) 
			    {
				temp[counter] = data[stepper];
				stepper = 0; 
			    }
			








	first = 0; 
	last = wimbledon;
	
		
		
    */	    
	
	
		




    public String toString() 
    {
	String dump = "[";
	for(int counter = 0; counter < data.length; counter ++) 
	    {
		if(data[counter] == null) 
		    {
			dump = dump + "_";
		    }
		else
		    {
			dump = dump + data[counter];
		    }
		dump = dump + " ";
	    }
	
	dump = dump + "]";
	return dump;
    }
	

		
	
		
    public boolean isEmpty() 
    {
	for(int counter = 0; counter < length; counter++ ) 
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
	for (int counter = 0; counter < length; counter++ )
	    {
		if(data[counter] == null)
		    {
			return false;
		    }
	    }
	return true;
    }






    public static void main(String[] args)
    {
	MyDeque a = new MyDeque(11);
	a.addFirst(3);
	System.out.println(a.toString());
	a.addLast(4);
	System.out.println(a.toString ());
	a.addFirst(6);
	System.out.println(a.toString());
	a.removeFirst();
	System.out.println(a.first);
	System.out.println(a.toString());
	
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
    
