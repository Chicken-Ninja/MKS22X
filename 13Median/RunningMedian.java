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

	if(max.size() - min.size() > 1)
	    {
		for(int counter = 0; counter < max.size() - min.size(); counter++ )
		    {
			double temp = max.remove() ;
			System.out.println(temp);
			min.add(temp) ;
		    }
	    }
	if(min.size() - max.size() > 1)
	    {
		for(int counter = 0; counter < min.size() - max.size(); counter++ )
		    {
			double temp = min.remove() ;
			System.out.println(temp);
			max.add(temp);
		    }
	    }
			



	
	if(value >= median) 
	    {
		min.add(value);
	    }
	
	else if(value < median) 
	    {
		max.add(value);
	    }

	







	

	/*	if(max.size() - min.size() > 1)
	    {
		//System.out.println(max.size() - min.size());
		for(int counter = max.size() - min.size(); counter >= 0; counter-- )
		    {
			Double temp = max.remove() ;
			
			min.add(temp);
		    }
	    }
	else if(min.size() - max.size() > 1)
	    {
		//System.out.println(min.size() - max.size());
		for(int counter = max.size() - min.size(); counter >= 0; counter-- )
		    {
			Double temp = min.remove();
			System.out.println(temp);
			max.add(temp);
		    }
		//System.out.println(max.toString());
		//System.out.println(min.toString());
	    }
	    /*	
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
	if(min.size() - max.size() == 1)
	    {
		//System.out.println("HELLO");
		//System.out.println(min.peek());
		
		median = min.peek() ;
	    }
	else if(max.size() == min.size())
	    {
		median = (max.peek() + min.peek()) / 2 ;
	    }
	System.out.println(max.toString() + " WHOOOO " + min.toString());
        
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
	a.add(14.0);
	a.add(16.0);
	a.add(18.0);
	a.add(20.0);
	a.add(22.0);
	System.out.println(a.getMedian()) ;
	//System.out.println(a.toString());
    }
			   



    
}
    
    
	   
    
    
	
