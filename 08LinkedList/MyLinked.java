public class MyLinked {
    Node first;
    Node last;
    int length; 
    
    public MyLinked()
    {
    }
    
    public boolean add(int value)
    {
	Node a = new Node(null , last , value);
	last.setNext(a);
	last = a; 
	
	
    }
    
    private int size()
    {
	return length; 
    }
    
    public String toString()
    {
	String dump = "[";
	Node temp = start; 
	while(Node.getNext().getValue()!= null) 
	    {
		temp = Node.getNext();
		dump = dump + temp.getValue();
		dump += ","; 
	    }
	return dump + "]"; 
    }
    
    private int get(int index)
    {
	Node temp = start; 
	for(int counter = 0; counter <= index; counter++ ) 
	    {
		temp = temp.getNext();
	    }
	return temp.getValue();
    }
    
			
    

    
    private int set(int index, int newValue)
    {
	Node temp = start;
	for(int counter = 0; counter <= index; counter++ )
	    {
		
		if(counter == index) 
		    {
			return temp.getValue();
		    }
		if(Node.getNext().getValue() != null) 
		    {
			temp = Node.getNext();
			
		    }
		
		
		
	    }
    
    
    
    }
}


	    
	
	
	
	
	

       





       	       
		
       
       
       	      
       	      