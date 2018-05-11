import java.util.*;




public class RunningMedian
{
    MyHeap<Double> min;
    MyHeap<Double> max;
    double median;

    public RunningMedian()
    {
	min = new MyHeap<>(false);
        max = new MyHeap<>();
	median = 0.0; 
    }

    public void add(Double value)
    {
	//	System.out.println(max.size());
	//      System.out.println(min.size());
	
	if(value >= median) 
	    {
		min.add(value);
	    }
	
	if(value < median) 
	    {
		max.add(value);
	    }
	      

	if(max.size() - min.size() > 1)
	    {
		for(int counter = max.size() - min.size(); counter > 0; counter-- )
		    {
			Double temp = max.remove() ;
			min.add(temp);
		    }
	    }
	else if(min.size() - max.size() > 1)
	    {
		for(int counter = max.size() - min.size(); counter > 0; counter-- )
		    {
			Double temp = min.remove();
			max.add(temp);
		    }
	    }
    		
	/*if(value >= median)
	    {
		min.add(value);
	    }
	if(value < median)
	    {
		max.add(value);
	    }
	*/
	//System.out.println(max.size());
	//System.out.println(min.size());
	if(max.size() -  min.size() == 1 )
	    {
		median = max.peek();
	    }
	else if(min.size() - max.size() == 1)
	    {
		median = min.peek() ;
	    }
	else if(max.size() == min.size())
	    {
		median = (max.peek() + min.peek()) / 2;
	    }
	//System.out.println(max.peek());
	//System.out.println(min.peek());
    }

    public String toString()
    {
	String dump = "";
	dump += min.toString();
	dump += max.toString();
	return dump; 
	
    }

    
    public int size()
    {
	return max.size() + min.size();
    }
    


    

    public Double getMedian()
    {
	if(max.size() + min.size() == 0)
	    {
		throw new NoSuchElementException();
	    }
	
	return median;
    }

    public static void main(String[] args)
    {
	RunningMedian a = new RunningMedian();
	a.add(10.0);
	//System.out.println(a.toString());
	a.add(12.0);
	System.out.println(a.getMedian()) ;
    }
			   



    
}
    
    
	   
    
    
	
