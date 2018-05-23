import java.util.Iterator;





public class MyLinkedListImproved <T extends Comparable<T>> implements Iterable<T>
{
    private Node first = null;
    private Node last = null;
    private int length = 0;
    
    public MyLinkedListImproved()
    {
    }


    public Iterator<T> iterator()
    {
	return new LinkedListIterator(this);
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
						
    public int max ()
    {
	if(length == 0) 
	    {
		return -1; 
	    }
	Node current = first; 
	Node highest = first; 
	int maxindex = 0; 
	for( int counter = 0; counter <= length; counter++)
	    {
		if(current.getValue().compareTo(highest.getValue()) == 1)
		    {
			maxindex = counter; 
			highest = current;
		    }
		//System.out.println(counter);
		//System.out.println(highest);
		//System.out.println(maxindex);
		
		if(counter != length - 1) 
		    {
			current = current.getNext();
		    }
	    }
	return maxindex;
    }
    
    public int min()
    {
	if(length == 0) 
	    {
		return -1;
	    }
	Node current = first;
	Node lowest = first; 
	int minindex = 0;
	for(int counter = 0; counter <= length; counter++)
	    {
		if(current.getValue().compareTo(lowest.getValue()) == -1 )
		    {
			minindex = counter; 
			lowest = current;
		    }
		if( counter != length - 1)
		    {
			current = current.getNext();
		    }
	    }
	return minindex;
    }
    
    public void extend(MyLinkedListImproved<T> other)
    {
	last.setNext(other.first);
	other.first.setPrev(last);
	length += other.length;
	last = other.last; 
	other.clear();
    }

    public int digits (MyLinkedListImproved<Integer> data)
    {
	int largest = data.get(data.max());
	String thing = "" + largest; 
	return thing.length();
    }

 
	
    /*	
	
    public static void radixsort(MyLinkedListImproved<Integer> data) 
    {
	int maxDigits = data.digits(data);
	String[] temp = new String[data.length];
	MyLinkedListImproved<Integer> datum = new MyLinkedListImproved<>();
	
	static Node current = data.first; 
	for(int counter = 0; counter < data.length; counter++ )
	    {
		temp[counter] = "" + current.getValue();
		current = current.getNext();
	    }
	for(int counter = 0; counter < temp.length; counter++ )
	    {
		int distance = maxDigits - temp[counter].length();
		for(int stepper = 0; stepper < distance; stepper++)
		    {
			temp[counter] = "0" + temp[counter];
		    }
	    }
	
	
    }
    */
	
		    
	
    

    


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

	public  LinkedListIterator(MyLinkedListImproved<T> thing)
	{
	    this.a = thing;
	    current = thing.first;
	}

	public T next()
	{
	    T temp;
	    temp = current.getValue();
	    if(hasNext())
		{
		    current = current.getNext();
		}
	    else
		{
		    System.exit(0);
		}
	    return temp;
	}

	public boolean hasNext()
	{
	    return current.getNext() == null;
	}

    }
    
}
