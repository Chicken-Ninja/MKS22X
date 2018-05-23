import java.util.*;
import java.util.Arrays;



public class Sorts 
{
    
    public static void radixsort(MyLinkedListImproved<Integer> data)
    {
	if(data.size() != 0)
	    {
		

		
		@SuppressWarnings("unchecked") MyLinkedListImproved<Integer>[] bucket = new MyLinkedListImproved [10];
		int digits = 1; 

		for(int stepper = 0; Math.pow(10, stepper) <= data.get(data.max()); stepper++ ) 
		    {
			digits ++;
		    }
		
						
		
		for(int counter = 1; counter < bucket.length; counter++) 
		    {
			bucket[counter] = new MyLinkedListImproved<Integer> (); 
		    }
			
		for(int counter = 0; counter < digits; counter ++ ) 
		    {
			for(Integer a : data) 
			    {
				int temp = (int)(a / Math.pow(10 , counter));
				bucket[temp % 10].add(a);
				
			    }
			data.clear(); 
			for(int x = 0 ; x < bucket.length; x++ )
			    {
				data.extend(bucket[x]);
			    }
		    }
	    }
    }
}
				
			
			
		      




















