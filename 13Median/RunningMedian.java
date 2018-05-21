import java.util.*;




public class RunningMedian
{
    MyHeap<Double> min;
    MyHeap<Double> max;
    double median;
    int size = 0; 

    public RunningMedian()
    {
	min = new MyHeap<>(false);
        max = new MyHeap<>();
	median = 0.0; 
    }

    public void add(Double value)
    {
	if(size == 0 )
	    {
		max.add(value);
	    }
	else 
	    {

		if(value >= getMedian()) 
		    {
			min.add(value);
		    }
		
		else if(value < getMedian()) 
		    {
			max.add(value);
		    }
	    }
	if(max.size() - min.size() > 1) 
	    {
		min.add(max.remove());
	    }
	else if(min.size() - max.size() > 1) 
	    {
		max.add(min.remove());
	    }
	size++ ;
    }

    public Double getMedian() 
    {
	if(size == 0 )
	    {
		throw new NoSuchElementException() ; 
	    }
	if(max.size() - min.size() == 1 )
	    {
		return max.peek(); 
	    }
	else if(min.size () - max.size () == 1)
	    {
		return min.peek ();
	    }
	else if(min.size() == max.size() )
	    {
		return (min.peek() + max.peek()) / 2.0;
	    }
    return 0.123344556;
    }

	
	
    public String toString()
    {
	String dump = "";
	dump += max.toString();
	dump += " ";
	dump += min.toString();
	return dump; 
	
    }

    public int size()
    {
	return size;
    }



    public static void main(String[] args)
    {
	RunningMedian a = new RunningMedian();
	a.add(10.0);
	//System.out.println(a.toString());
	a.add(12.0);
	a.add(14.0);
	a.add(16.0);
	a.add(18.0);
	a.add(20.0);
	a.add(22.0);
	System.out.println(a.getMedian()) ;
	//System.out.println(a.toString());
    }
			   



    
}
    
    
	   
    
    
	
