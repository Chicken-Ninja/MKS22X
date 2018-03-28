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

       





       	       
		
       
       
       	      
       	      