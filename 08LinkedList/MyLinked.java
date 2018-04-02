public class MyLinked {
    private Node first = null;
    private Node last = null;
    private int length = 0;
    
    public MyLinked()
    {
    }

    public void clear() {
	first = null;
	last = null; 
	length = 0; 
    }
    
    



    public boolean add(int value)
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
	//	a.setValue(value);
	//a.setNext(null);
	//a.setPrev(last);
	
	return true;
	
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
    
    public int get(int index)
    {
	
	Node temp = first; 
	for(int counter = 0; counter <= index - 1; counter++ ) 
	    {
		temp = temp.getNext();
	    }
	return temp.getValue();
    }
    
			
    

    
    public int set(int index, int newValue)
    {
	int value = 9999;
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
    public int indexOf(int value) 
    {
	Node temp = first; 
	int placeholder = 0; 
	for(int counter = 0; counter <= length; counter++ ) 
	    {
		if(temp.getValue() == value) 
		    {
			placeholder = counter;
			break;
		    }
		else if(temp.getValue() != value && counter == length)
		    {
			placeholder = -1; 
		    }
		else{
		    temp = temp.getNext(); 
		}
	    }
	return placeholder; 
    }
}


	    
	
	
	
	
	

       





       	       
		
       
       
       	      
       	      
