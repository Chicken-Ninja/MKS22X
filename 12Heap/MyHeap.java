public class MyHeap
{
    String[] data;
    boolean IsMax;
    int length; 

    public MyHeap()
    {
	data = new String[0];
	IsMax = true;
	length = 0; 

    }


    public MyHeap(boolean woot )
    {
	if(woot == true)
	    {
		data = new String[0];
		IsMax = true;
		length  = 0; 

	    }
	else
	    {
		data = new String[0];
		IsMax = false;
		length = 0; 
	    }
    }

    public String toString()
    {
	String dump = "";
	
	for( int counter = 0; counter < length; counter++)
	    {
		dump = dump + data[counter];
		dump = dump + "_";
	    }

	return dump;
    }
		

    public int size()
    {
	return length;
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

    public boolean isFilled()
    {
	for(int counter = 0; counter < length; counter++ )
	    {
		if(data[counter] == null)
		    {
			return false;
		    }
	    }
	return true;
    }

    public boolean isEmpty()
    {
        for(int counter =  0 ; counter < length; counter++ )
	    {
		if(data[counter] != null)
		    {
			return false;
		    }
	    }
	return true;
    }
	       


    public void add(String thing)
    {
	if(IsMax == true)
	    {
		if(

    public static void main(String[] args)
    {
	MyHeap a = new MyHeap();
	//a.resize();
	//a.add("Hi");
	//System.out.println(a.toString());
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
