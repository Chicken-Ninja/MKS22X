public class Merge{

    
    public static String toString(int[] r)
    {
	String dump = "[ ";
	for(int counter = 0; counter < r.length; counter++ )
	    {
		dump = dump + r[counter];
		dump = dump + " ";
	    }
	return dump; 
    }

    public static void merge(int[]data ,int[]temp , int lo , int mid , int hi)
    {
        int first = lo;
	int second = mid + 1; 
	for(int counter = lo; counter < = hi; i++)
	    {
		if(firstI > mid) 
		    {
			data[counter] = temp[second];
			second++;
		    }
		else if(second > hi)
		    {
			data[counter] = temp[first];
			first ++;
		    }
		else if(temp[first] < temp[first] ) 
		    {
			data[counter] = temp[second];
			second ++;
		    }
	    }
    }


     private static void swap(int[]data,int a, int b){
        int c = data[a];
        data[a] = data[b];
        data[b] = c;
    }


    



    
    public static void mergesort(int[] data)
    {
	int[]temp = new int[data.length];
	msort(data, temp , 0 , data.length -1 );
    }

    public static void Insertion(int[] data, in start , int end)
    {
	for(int counter = start + 1; counter <= end; counter ++ ) 
	    {
		int place = counter; 
		for(int stepper = counter - 1; stepper >= start; stepper -- ) 
		    {
			if(data[stepper] > data[counter])
			    {
				swap(data , counter , place );
				place = counter;
			    }
		    }
	    }
    }
									     
							    
							    





    public static void msort(int[] data, int[] temp , int lo, int hi)
    {
	if(hi < lo  <= 25) 
	    {
		Insertion(data ,lo hi );
	    }
	for(int counter = lo ; counter < hi; counter ++ ) 
	    {
		temp[counter] = data[counter ]; 
	    }
	int mid = (lo + hi) / 2 ;
	msort(temp, data, lo , mid );
	msort(temp, data, mid + 1 , hi );
	merge(data , temp, lo, mid , hi);
    }
}
	      
		
