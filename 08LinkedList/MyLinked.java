public class MyLinked {
    private Node first;
    private Node last;
    private int length; 
    
    public MyLinked()
    {
    }
    
    public boolean add(int value)
    {
	
	Node a = new Node(null, last , value);
	//	a.setValue(value);
	//a.setNext(null);
	//a.setPrev(last);
	last.setNext(a);
	last = a; 
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


	    
	
	
	
	
	

       





       	       
		
       
       
       	      
       	      
