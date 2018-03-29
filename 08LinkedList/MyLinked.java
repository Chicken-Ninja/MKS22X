public class MyLinked {
    Node first;
    Node last;
    int length; 
    
    public MyLinkedList()
    {
    }
    
    public boolean add(int value)
    {
    }
    
    private int size()
    {
	return length; 
    }
    
    private String toString()
    {
	String dump = "";
	Node temp = start; 
	while(Node.getNext().getValue()!= null) 
	    {
		temp = Node.getNext();
		dump = dump + temp.getValue();
		dump += " "; 
	    }
	return dump; 
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

public class Node {
    Node next;
    Node Prev; 
    int data;
    

    public Node (Node a, Node b , int c) {
	next = a; 
	Prev = b; 
	data = c; 
    }

    public Node getNext() 
    {
	return next;
    }
    
    public void setNext(Node a) 
    {
	next = a; 
    }

    public Node getPrev() 
    {
	return Prev; 
    }
    
    public void setPrev(Node a) 
    {
	prev = a ; 
    }

    public int getValue() 
    {
	return data; 
    }
    
    public int setValue(int a) 
    {
	data = a; 
    }

    public String toString() 
    {
	String dump = "";
	return dump + data;
    }
	    
	
	
	
	
	

       





       	       
		
       
       
       	      
       	      