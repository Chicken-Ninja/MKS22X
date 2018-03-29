public class MyLinked {
    private Node first = null;
    private Node last = null;
    private int length = 0;
    
    public MyLinked()
    {
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
    
    private int size()
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
    
    private int get(int index)
    {
	Node temp = first; 
	for(int counter = 0; counter <= index; counter++ ) 
	    {
		temp = temp.getNext();
	    }
	return temp.getValue();
    }
    
			
    

    
    private int set(int index, int newValue)
    {
	int value = 9999;
	Node temp = first;
	for(int counter = 0; counter <= index; counter++ )
	    {
		
		if(counter == index) 
		    {
			value = temp.getValue();
		    }
		if(temp.getNext()!= null) 
		    {
			temp = temp.getNext();
			
		    }
		
		
		
	    }
	return value;
    
    
    }
}


	    
	
	
	
	
	

       





       	       
		
       
       
       	      
       	      
