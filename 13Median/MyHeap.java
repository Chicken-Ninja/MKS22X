public class MyHeap<T extends Comparable<T>>
{
    T[] data;
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

    public void setSize( int a) 
    {
	size = a; 
    }

    public void Heapify(T[] a) 
    {
	data = a;
	size = data.length; 
	for(int counter = 0; counter < size; counter ++ )
	    {
		pushDownMax(counter);
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
	//If if the position above it is smaller than it, move it up. Recursive. MAX
	if(data[(index - 1) /2].compareTo(data[index]) < 0)
	    {
		swap((index - 1) / 2 , index);
		pushUpMax((index - 1) / 2);
	    }
    }

    public void pushUpMin(int index)
    {
	//If the position above it is bigger than it is, move it up. Recursive. MIN
	if(data[(index - 1) /2].compareTo(data[index]) > 0)
	    {
		swap((index - 1) / 2 , index);
		pushUpMin((index - 1) / 2);
	    }
    }

    public void pushDownMax(int index)
    {
	//If the number in index is bigger than the one underneath it, move it down, and recursive shit.Maximum
	
	if((index * 2) + 2 <= size - 1) 
	    {
		
		if(data[index * 2 + 1].compareTo(data[index]) > 0 || data[(index * 2) + 2].compareTo(data[index]) > 0)
		    {
		
			if(data[index * 2 + 1].compareTo(data[(index * 2) + 2]) > 0)
			    {
			
				
				swap(index , index * 2 + 1);
				pushDownMax(index * 2 + 1);
			    }
			else
			    {
				
				swap(index , (index * 2) + 2);
				pushDownMax((index * 2) + 2) ;
			    }
		    }
	    }
    }
    public void pushDownMin(int index)
    {
	
	//IF the number in index is bigger than the ones underneath it, move this number down, and recursive it down. Minimum 

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
	MyHeap z = new MyHeap<Double>(false);
	MyHeap x = new MyHeap<Double>();
	z.add(12.0);
	z.add(14.0);
	z.add(16.0);
	z.add(18.0);
	System.out.println(z.toString());
	z.remove(); 
	System.out.println(z.toString());
	z.remove();
	
	System.out.println(z.toString());
	x.add(10.0);
	x.add(12.0);
	x.add(16.0);
	x.add(22.0);
	x.add(11.0);
	x.add(40.0);
	//	System.out.println(x.toString());
	z.add(x.remove());
	//System.out.println(x.toString());
	

	//z.add(16.0);
	//	System.out.println(z.toString());

	//	System.out.println(z.toString());
	//x.add(z.remove());
	//System.out.println(z.toString());
	//System.out.println(x.toString());
	//System.out.println(z.toString());
	
	
    }
}
	
	

       


    
       

    /* public void add(String s)
    {
	if(IsMax == true)
	    {
		if(length = 0 )
		    {
			
		
	
	  
			*/
