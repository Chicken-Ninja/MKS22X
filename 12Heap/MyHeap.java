public class MyHeap
{
    String[] data;
    boolean IsMax;
    int length;
    int size = 0;

    public MyHeap()
    {
	data = new String[1];
	IsMax = true;
	length = 1; 

    }


    public MyHeap(boolean woot )
    {
	if(woot == true)
	    {
		data = new String[1];
		IsMax = true;
		length  = 1; 

	    }
	else
	    {
		data = new String[1];
		IsMax = false;
		length = 1; 
	    }
    }

    public String toString()
    {
	String dump = "";
	
	for( int counter = 0; counter < data.length; counter++)
	    {
		dump = dump + data[counter];
		dump = dump + "_";
		
	    }
	return dump;
    }
		

    public int size()
    {
	return size;
    }

    public void resize()
    {
	String[] temp = new String[length * 2];
	for(int counter = 0; counter < length; counter++)
	    {
		temp[counter] = data[counter];
	    }
	
	data = temp; 
	length = length * 2;
    }


    public void swap(int a, int b)
    {
	String c = data[a];
	data[a] = data[b];
	data[b] = c;
    }

    public void pushUp(int index)
    {
	if(data[(index - 1) /2].compareTo(data[index]) < 0)
	    {
		swap((index - 1) / 2 , index);
		pushUp((index - 1) / 2);
	    }
    }

    public void pushMin(int index)
    {
	if(data[(index - 1) /2].compareTo(data[index]) == 1)
	    {
		swap((index - 1) / 2 , index);
		pushMin((index - 1) / 2);
	    }
    }

    public void pushDownMax(int index)
    {
	if(data[index * 2].compareTo(data[index]) == 1 || data[(index * 2) + 1].compareTo(data[index]) == 1)
	    {
		if(data[index * 2].compareTo(data[(index * 2) + 1]) == 1)
		    {
			swap(index , index * 2);
			pushDownMax(index * 2);
		    }
		else
		    {
			swap(index , (index * 2) + 1);
			pushDownMax((index * 2) + 1) ;
		    }
	    }
    }
			   
    public void pushDownMin(int index)
    {
	if(data[index * 2].compareTo(data[index]) < 0 || data[(index * 2) + 1].compareTo(data[index]) < 0)
		    {
		if(data[index * 2].compareTo(data[(index * 2) + 1]) < 0)
		    {
			swap(index , index * 2);
			pushDownMax(index * 2);
		    }
		else
		    {
			swap(index , (index * 2) + 1);
			pushDownMax((index * 2) + 1) ;
		    }
	    }
    }
    
    
	   
	       


    public void add(String thing)
    {
	System.out.println(size);
	if(IsMax == true)
	    {
		if(size == length)
		    {
			resize();
		    }
		
		if(size == 0)
		    {
		        data[0] = thing;
			size ++; 
		    }
		else 
		    {
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
			pushUp(placeholder);
		    }
		size++;
	    }
	else
	    {
		if(size == length )
		    {
			resize() ;
		    }
		if(size == 0)
		    {
			data[0] = thing;
			size++;
		    }
		else
		    {
			int placeholder = 0;
			for(int counter = 0; counter < data.length; counter ++)
			    {
				if(data[counter] != null)
				   {
				       placeholder = counter;
				       data[counter] = thing;
				       break;
				   }
			    }
			pushMin(placeholder);
		    }
		size++;
	    }
	System.out.println(size);
		    
    }

    public void remove()
    {
	if(IsMax == true)
	    {
		if(size == 0)
		    {
			throw new ArrayIndexOutOfBoundsException();
		    }
		else
		    {
			swap(size , 0);
			pushDownMax(0);
			size--;
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
			swap(size , 0);
			pushDownMin(0);
			size--;
		    }
	    }
    }
			
			    
		
			  


			
					    
				
			
			
			

    public static void main(String[] args)
    {
	MyHeap a = new MyHeap();
	//a.resize();
	//a.resize();
	//a.resize();
	//a.resize();
	a.add("A");
	a.add("B");
	a.add("C");
	a.add("D");
	a.add("E");
	a.add("F");
	a.add("A");
	
	System.out.println(a.toString());
	a.remove();
	a.remove();
	a.remove();
	//a.resize();
	//a.add("Hi");
	System.out.println(a.toString());
	//a.resize();
	//System.out.println(a.toString());

	//RESIZE TESTING

	
    }
}
	
	

       


    
       

    /* public void add(String s)
    {
	if(IsMax == true)
	    {
		if(length = 0 )
		    {
			
		
	
	  
			*/
