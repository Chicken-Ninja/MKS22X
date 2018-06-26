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
	//first = 0; 
	//last = 9; 
	
	
    }

    public void checkresize()
    {
	resize();
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

	
	if(isFull() == true)
	    {
		//System.out.println("HELP");

		checkresize();

		//resize();
		//System.out.println(this);

	    }
	   if(numberOfElements() == 0 )
	    {	 
		data[0] = thing;
		first = 0;
		last = 0; 
		
	    }
    
	
	   else if(first == 0)
	       {
		data[length - 1] = thing;
		first = length - 1; 
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

	if(isFull() == true)
	    {
		checkresize();
		//resize();
		
	    }
	if( numberOfElements() == 0 ) 
	    {
		data[0] = thing;
		first = 0; 
		last = 0 ;
		
	    }
		
	
	else if(last == length - 1 && isFull() == false)
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
	     
    public int numberOfElements() 
    {
	int dump = 0;
	for(int counter = 0; counter < length; counter ++ ) 
	    {
		if( data[counter] != null) 
		    {
			dump++;
		    }
	    }
	return dump; 
    }

    @SuppressWarnings("unchecked")
    public void resize() {
	E[] temp = (E[])new Object[data.length * 2];

	for (int counter = 0; counter < numberOfElements(); counter ++) {
	    temp[counter] = data[(first + counter) % data.length];
	}
	
	data = temp;
	first = 0;
	last = numberOfElements() - 1;
	
    }


    /* @SuppressWarnings("unchecked")
    public void resize() 
    {
	E[] temp = (E[])new Object[length * 2];
	int size = 0;
	if(first > last) 
	    {
		//int size = length; 
		int tempCounter = 0; 
		int dataCounter = first; 
		//int totalCounter = 0;
		int elements = numberOfElements();
		while(tempCounter <= elements)
		    {
			if(dataCounter == length) 
			    {
				temp[tempCounter] = data[dataCounter];
				dataCounter = 0;
				tempCounter++;
			    }
			else
			    {
				temp[tempCounter] = data[dataCounter];
				dataCounter ++;
				tempCounter++;
			    }
		    }
		size = tempCounter; 
	    }
	else
	    {
		int tempCounter = 0;
		int dataCounter = first; 
		for(int counter = 0 ; counter <= last; counter ++)
		    {
			temp[tempCounter] = data[dataCounter];
			tempCounter++;
			dataCounter++;
		    }
		size = tempCounter;
	    }
	data = temp;
	first = 0; 
	last = size - 1;
	length = length * 2;
	
	}*/
								
		    
		
	
	
		


   public String toString(){
	String ans = "[";
	if(first < last){
	    for (int i = first; i <= last; i++){
		ans += data[i] + ", ";
	    }
	}

	else if(first == last) 
	    {
		for(int counter = first;counter < data.length; counter++)
		    {
			ans += data[counter] + ", ";
		    }
		for(int counter = 0; counter < last; counter ++ ) 
		    {
			ans += data[counter] + ", ";
		    }
	    }
		
	else{
	    for(int i = first; i < data.length; i++){
		ans += data[i] + ", ";
	    }
	    for(int i = 0; i <= last; i++){
		ans += data[i] + ", ";
	    }
	}
	ans = ans.substring(0, ans.length() - 2) + "]";
	return ans;
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



     public static void main(String[] args) {
	MyDeque<String> a = new MyDeque<>();

	System.out.println(a.toString());

        a.addFirst("foo");
	System.out.println(a.toString());
        a.addFirst("do");
	System.out.println(a.toString());
	a.addLast("end");
	System.out.println(a.toString());
	a.addLast("first");
	

	System.out.println(a.toString());
	
	System.out.println(a.getFirst());
	System.out.println(a.getLast());

	a.addLast("def");
	a.addLast("gab");
	a.addLast("leo");
	a.addLast("fas");
	a.addLast("der");
	System.out.println(a.toString());
	//should reisze
	a.addLast("edd");

	System.out.println(a.toString());

	System.out.println(a.removeLast());
	System.out.println(a.toString());

	System.out.println(a.removeFirst());
	System.out.println(a.toString());
    }
}
    

   