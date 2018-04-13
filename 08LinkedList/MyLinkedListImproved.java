import java.util.Iterator;





public class MyLinkedListImproved <T extends Comparable<T>> implements Iterable<T>
{
    private Node first = null;
    private Node last = null;
    private int length = 0;
    
    public MyLinkedListImproved()
    {
    }

    public void clear() {
	first = null;
	last = null; 
	length = 0; 
    }
    
    
    


    public boolean add(T value)
    {
	if(last == null)
	    {
		Node a = new Node(null, null, value);
		last = a;
		first = a;
		
	    }
	  
	//	Node a = new Node(null, last , value);
	//	else if(length == 0)
	//  {
	//	Node b = new Node(null, null, value);
	//	first = b;

	///  }
	else{
	    Node c = new Node(null, last, value);
	    last.setNext(c);
	    last = c;
	}
	length++;
	
	//	a.setValue(value);
	//a.setNext(null);
	//a.setPrev(last);
	
	return true;
	
    }

    public void add(int Index , T value)
    {
	if(Index > length) 
	    {
		throw new IllegalArgumentException();
	    }
	else if(Index < 0)
	    {
		throw new IllegalArgumentException() ;
	    }
	else if(Index == 0 && length == 0)
	    {
		//	Node a = new Node(null, null,value);
		add(value);
	    }
	else if(Index == 0) 
	    {
		Node a = new Node(first , null, value);
		first.setPrev(a); 
		first = a;
		length++;
	    }
	else if(Index == length) 
	    {
		Node a = new Node(null, last, value); 
		last.setNext(a);
		last = a; 
		length++;
	    }
	else if(Index != 0 && Index != length) 
	    {
	    Node temp = first;
	    Node tempNext = first.getNext();  
	    System.out.println(toString());
	   
	    for(int counter = 1; counter <= length; counter++) 
		{
		    if(counter == Index) 
			{
			    Node a = new Node(tempNext , temp , value);
			    temp.setNext(a);
			    tempNext.setPrev(a);
			    
			}
		    else if(tempNext.getNext() != null)
			{
			temp = temp.getNext(); 
			tempNext = tempNext.getNext();
			}
		    System.out.println(toString());
			    
		}
	    length++;
	    }
    }
	
     public boolean remove(T value) 
    {
	Node temp = first; 
	for(int counter = 0; counter <= length; counter ++ ) 
	    {
		if(temp.getValue() == value) 
		    {
			if(counter == 0)
			    {
				temp.getNext().setPrev(null);
				first = temp.getNext();
				length--;
				
			    }
			else if(counter == length) 
			    {
				temp.getPrev().setNext(null);
				last = temp.getPrev();
				length--;
			    }
			else{
			
				
			temp.getPrev().setNext(temp.getNext());
			temp.getNext().setPrev(temp.getPrev());
			length --; 
			}
		    }
		else
		    {
		    temp = temp.getNext();
		    }
	    }
	return false; 
    }

    
	
    











		
    public T remove(int index)
    {
	Node temp = first; 
	T placeholder = first.getValue();
	
	if(index > length) 
	    {
		throw new IllegalArgumentException();
	    }
	if(index < 0) 
	    {
		throw new IllegalArgumentException();
	    }
        if(index == 0) 
	    {
		placeholder = first.getValue();
		first.getNext().setPrev(null);
		first = first.getNext();
		length--;
		return placeholder;
	    }
	else if(index == length) 
	    {
		placeholder = last.getValue();
		
		last = last.getPrev();
		last.setNext(null);
		length--;
		return placeholder; 
	    }
	else{
	
	for(int counter = 0; counter <= length; counter ++ ) 
	    {
		if(counter == index) 
		    {
			placeholder = temp.getValue();
			temp.getPrev().setNext(temp.getNext()); 
			temp.getNext().setPrev(temp.getPrev());
			length--;
			
		    }
		else {
		    temp = temp.getNext();
		}
	
	    }
	}
	return placeholder;
    }
	
    
    
    
    
    
    
    
    
    
    
    public int size()
    {
	return length; 
    }
    
    public String toString()
    {
	String dump = "[";
	Node temp = first;
	dump += temp.getValue() + ",";
	while(temp.getNext()!= null) 
	    {
		temp = temp.getNext();
		dump = dump + temp.getValue();
		dump += ","; 
	    }
	return dump + "]"; 
    }
    
    public T get(int index)
    {
	
	Node temp = first; 
	for(int counter = 0; counter <= index - 1; counter++ ) 
	    {
		temp = temp.getNext();
	    }
	return temp.getValue();
    }
    
			
    

    
    public T set(int index, T newValue)
    {
	T value = first.getValue();
	Node temp = first;
	for(int counter = 0; counter <= index ; counter++ )
	    {
		
		if(counter == index) 
		    {
			value = temp.getValue();
			temp.setValue(newValue);
		    }
		if(temp.getNext()!= null) 
		    {
			temp = temp.getNext();
			
		    }
		
		
		
	    }
	return value;
    
    
    }
    public int indexOf(T value) 
    {
	Node temp = first; 
	int placeholder = -1;
	for(int counter = 0; counter <= 3; counter++ ) 
	    {
		System.out.println(temp.getValue());
		if(temp.getValue() == value) 
		    {
			placeholder = counter;
			break;
			
		    }
		//	else if(temp.getValue() != value && counter == length)
		//  {
		//placeholder = -1; 
		//   }
		else{
		    temp = temp.getNext(); 
		}
	    }
	return placeholder; 
    }
    

    


    public class Node {
	Node Next;
	Node Prev; 
	T data;
	
	
	public Node (Node a, Node b , T c) {
	Next = a; 
	Prev = b; 
	data = c; 
	}
	
	public Node getNext() 
	{
	    return Next;
	}
	
	public void setNext(Node a) 
	{
	Next = a; 
	}
	
	public Node getPrev() 
	{
	    return Prev; 
	}
	
	public void setPrev(Node a) 
	{
	    Prev = a ; 
	}
	
	public T getValue() 
	{
	return data; 
	}
	
	public void setValue(T a) 
	{
	    data = a; 
	}
	
	public String toString() 
	{
	    String dump = "";
	    return dump + data;
	}
    }
    private class LinkedListIterator implements Iterator <T>
    {
	private MyLinkedListImproved a;
	private Node current;

	private LinkedListIterator(MyLinkedListImproved thing)
	{
	    this.a = thing;
	    current = thing.get(0);
	}

	private T next()
	{
	    T temp;
	    temp = current.getValue();
	    if(hasNext())
		{
		    current = thing.getNext();
		}
	    else
		{
		    System.exit(0);
		}
	    return temp;
	}

	private boolean hasNext()
	{
	    return current.getNext() == null;
	}

    }
    
}
