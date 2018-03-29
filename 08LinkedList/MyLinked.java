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
       }

       private int get(int index)
       {int value = 0; 
	if(index > length) {throw new IllegalArgumentException();}
	for (int counter = 0; counter <= index; counter++)
	    {
		if(index == counter) {
			 return value;
			 }
	        else{value = Node.getNext().getValue();}
		}
			 
			 
			
	
       }

       private int set(int index, int newValue)
       {
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
	    
	
	
	
	
	

       





       	       
		
       
       
       	      
       	      