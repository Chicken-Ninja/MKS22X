public class MyHeap<T extends Comparable<T>>
{
    private T[] data;
    boolean IsMax;
    int length;
    int size = 0;

    @SuppressWarnings("Unchecked")
    public MyHeap()
    {
	data = (T[])new Comparable[1];
	IsMax = true;
	length = 1; 

    }

    @SuppressWarnings("Unchecked") 
    public MyHeap(boolean woot )
    {
	if(woot == true)
	    {
		data = (T[]) new Comparable[1];
		IsMax = true;
		length  = 1; 

	    }
	else
	    {
		data = (T[]) new Comparable[1];
		IsMax = false;
		length = 1; 
	    }
    }

    public String toString()
    {
	String dump = "";
	
	for( int counter = 0; counter < size; counter++)
	    {
		dump = dump + data[counter];
		dump = dump + "_";
		
	    }
	System.out.println(size) ;

	return dump;
    }

    
		

    public int size()
    {
	return size;
    }

    public void resize()
    {
	T[] temp = (T[]) new Comparable[length * 2];
	for(int counter = 0; counter < length; counter++)
	    {
		temp[counter] = data[counter];
	    }
	
	data = temp; 
	length = length * 2;
    }


    public void swap(int a, int b)
    {
	T c = data[a];
	data[a] = data[b];
	data[b] = c;
    }

    public boolean isFull() 
    {
	for(int counter =  0; counter < length; counter++ ) 
	    {
		if(data[counter] == null) 
		    {
			return false;
		    }
	    }
	return true;
    }


    public void pushUpMax(int index)
    {
	if(data[(index - 1) /2].compareTo(data[index]) < 0)
	    {
		swap((index - 1) / 2 , index);
		pushUpMax((index - 1) / 2);
	    }
    }

    public void pushUpMin(int index)
    {
	if(data[(index - 1) /2].compareTo(data[index]) > 0)
	    {
		swap((index - 1) / 2 , index);
		pushUpMin((index - 1) / 2);
	    }
    }

    public void pushDownMax(int index)
    {
	//System.out.println(index * 2);
	//System.out.println(size);
	//System.out.println(index);
	if((index * 2) + 2 <= size - 1) 
	    {
		//System.out.println("HI");
		if(data[index * 2 + 1].compareTo(data[index]) > 0 || data[(index * 2) + 2].compareTo(data[index]) > 0)
		    {
			//System.out.println("Test 2");
			if(data[index * 2 + 1].compareTo(data[(index * 2) + 2]) > 0)
			    {
				//System.out.println("Test 3");
				
				swap(index , index * 2 + 1);
				pushDownMax(index * 2 + 1);
			    }
			else
			    {
				//System.out.println("Test 4"); 
				swap(index , (index * 2) + 2);
				pushDownMax((index * 2) + 2) ;
			    }
		    }
	    }
    }
    public void pushDownMin(int index)
    {
	if((index * 2) + 2 <= size - 1)
	    {
		if(data[index * 2 + 1].compareTo(data[index]) < 0 || data[(index * 2) + 2].compareTo(data[index]) < 0)
		   {
			if(data[index * 2 + 1].compareTo(data[(index * 2) + 2]) < 0)
			    {
				swap(index , index * 2 + 1);
				pushDownMin(index * 2 + 1);
			    }
			else
			    {
				swap(index , (index * 2) + 2);
				pushDownMin((index * 2) + 2) ;
			    }
		   }
	    }
    }
    
    
	   
	       


    public void add(T thing)
    {
	//System.out.println(size);
	


	if(IsMax == true)
	    {
		if(isFull())
		    {
			resize(); 
			//System.out.println("PLS");
		    }


		if(size == 0)
		    {
		        data[0] = thing;
			
			//System.out.println("HIYA");
		    }
		else 
		    {
			//System.out.println("HIYA 2");
			int placeholder = 0; 
			for(int counter = 0; counter < data.length; counter++ )
			    {
				if(data[counter] == null)
				    {
					placeholder = counter; 
					data[counter] = thing;
					break;
				    }
			    }
			pushUpMax(placeholder);
		    }
		size++;
	    }
	else
	    {
		if(isFull())
		    {
			resize() ;
		    }
		if(size == 0)
		    {
			data[0] = thing;
			
		    }
		else
		    {
			int placeholder = 0;
			for(int counter = 0; counter < data.length; counter ++)
			    {
				if(data[counter] == null)
				   {
				       placeholder = counter;
				       data[counter] = thing;
				       break;
				   }
			    }
			pushUpMin(placeholder);
		    }
		size++;
	    }
		    
    }

    public T remove()
    {
	if(IsMax == true)
	    {
		if(size == 0)
		    {
			throw new ArrayIndexOutOfBoundsException();
		    }
		else
		    {
			T temp = data[0];
			swap(size - 1 , 0);
			data[size - 1] = null; 
			size--;
			pushDownMax(0);
			
			return temp; 
		    }
	    }
	else
	    {
		if(size == 0)
		    {
			throw new ArrayIndexOutOfBoundsException();
		    }
		else
		    {
			T temp = data[0];
			swap(size - 1 , 0);
			data[size - 1] = null; 
			size --; 
			pushDownMin(0);
			
			
			return temp;
			
		    }
	    }
    }
			
    public T peek()
		       
    {
	return data[0];
    }

		
			  


			
					    
				
			
			
			

    public static void main(String[] args)
    {
	MyHeap a = new MyHeap<String>();
	//a.resize();
	//a.resize();
	//a.resize();
	//a.resize();
	//System.out.println(a.size());
	a.add("F");
	//System.out.println("Test");
	a.add("B");
	//System.out.println("TEst2");
	a.add("C");
	a.add("D");
	a.add("E");
	a.add("F");
	//a.add("A");
	
	System.out.println(a.toString());
	a.remove();
	System.out.println(a.toString());
	a.pushDownMax(0);
	System.out.println(a.toString());
	a.remove();
	System.out.println(a.toString());
	a.remove();
	System.out.println(a.toString());
	//a.resize();
	//a.add("Hi");
	//System.out.println(a.toString());
	//a.resize();
	//System.out.println(a.toString());

	//RESIZE TESTING


	System.out.println("MIN TESTING");
	
	MyHeap b = new MyHeap<String>( false ); 
	b.add("A");
	b.add("C");
	b.add("D");
	b.add("Z");
	b.add("B");
	b.add("E");
	b.add("F");
	System.out.println("hey");
	System.out.println(b.toString());
	//b.add("Y");
	//b.add("J");
	//b.add("X");
	b.remove();
	System.out.println(b.toString());
	b.remove();
	System.out.println(b.toString());
	b.remove();
	System.out.println(b.toString());
	b.remove();
	System.out.println(b.toString());
	    

	
    }
}
	
	

       


    
       

    /* public void add(String s)
    {
	if(IsMax == true)
	    {
		if(length = 0 )
		    {
			
		
	
	  
			*/
