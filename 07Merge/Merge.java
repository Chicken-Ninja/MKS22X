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



     private static void swap(int[]data,int a, int b){
        int c = data[a];
        data[a] = data[b];
        data[b] = c;
    }


    



    
    public static void mergesort(int[] data)
    {
	int[]temp = new int[data.length];
	for(int counter = 0; counter <= data.length - 1; counter ++ ) 
	    {
		temp[counter] = data[counter];
	    }
	msort(data, temp , 0 , data.length -1 );
    }

    public static void Insertion(int[] data, int start , int end)
    {
	for(int counter = start + 1; counter <= end; counter ++ ) 
	    {
		int place = counter; 
		for(int stepper = counter - 1; stepper >= start; stepper -- ) 
		    {
			if(data[stepper] > data[place])
			    {
				swap(data , stepper , place );
				place = counter;
			    }
		    }
	    }
    }
									     
							    
    public static void merge(int[] data,int[] temp,int lo,int mid, int hi){
	int first = lo;
	int second = mid + 1;
	for(int counter = lo; counter <= hi; counter++)
	    {
		if (first > mid)
		    {
			temp[first] = data[second];
			second++;
		    }
		else if (second > hi)
		    {
			temp[counter] = data[first];
			first++;
		    }
		else{
		    if (data[first] < data[second])
			{
			    temp[counter] = data[first];
			    first++;
			}
		    else
			{
			temp[counter] = data[second];
			second++;
			}
		}
	    }
    }				    
    
    
    


    public static void msort(int[] data, int[] temp , int lo, int hi)
    {
	if(hi - lo <= 25) 
	    {
		Insertion(data ,lo, hi );
		return;
	    }
	else if(hi - lo <= 1) 
	    {
		return;
	    }
	for(int counter = lo; counter <= hi ; counter++ )
	    {
		temp[counter] = data[counter];
	    }
	int mid = (lo + hi) / 2 ;
	msort(temp, data, lo , mid );
	msort(temp, data, mid + 1 , hi );
	merge(data , temp, lo, mid , hi);
    }





   public static void main(String [] args) 
	{
	    int[] a = {1 , 5 ,3 , 4 , 8 , 6, 7, 8,9};
	    Merge.mergesort(a);
	    String b = "";
	    for(int counter = 0; counter < a.length; counter++ )
		{
		    b += a[counter];
		    b += " ";
		}
	    System.out.println(b);
	}
		 
    

}
	      
		
