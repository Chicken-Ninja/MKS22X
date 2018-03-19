import java.util.*;
public class Quick{
   
    int value;
  

   

    public static  String toString(int[] nums) {
	String dump = ""; 
	for(int counter = 0; counter < nums.length; counter++ )
	    {dump = dump + nums[counter];
		dump = dump + " ";}
	return dump;
    }

    public static void swap(int[] nums , int a , int b)
    {
	int placeholder;
	placeholder = nums[b];
	nums[b] = nums[a];
	nums[a] = placeholder;
    }

    public static int partition(int[] nums, int start, int end) 
    { 
	Random rand = new Random();
	int i = start;
	int lt = start;
	int gt = end; 
	int pivot =  rand.nextInt(end-start+1) + start;
	int check = nums[pivot];
	//	System.out.println(nums[pivot]);
	while(i <= gt) 
	    {
		//	System.out.println(toString(nums));
		//System.out.println(i);
		if(nums[i] == check) 
		    {i++;}
	        else if(nums[i] > check) 
		    {
			swap(nums, i, gt);
			gt --;
		    }
		else{
		    swap(nums , i , lt);
		    i++;
		    lt++;
		}
	    }
    
	return gt;} 


    public static int quickSelect(int nums[], int k) 
    {
	int start = 0;
	int end = nums.length - 1;
	int v = 0; 
	v = partition(nums , start, end); 
	while(v != k) 
	    { 
		if(v < k ) 
		    {
			start = v; 
		    }
		if(v > k) 
		    {
			end = v; 
		    }
		
		v= partition(nums, start , end);
	    }
	return nums[v];
    }

    public static void quickSort (int[]  nums) 
    {
	 quickHelp( nums , 0 , nums.length - 1); 
    }

    public static void quickHelp(int[] nums, int start, int  end) 
    {
	int v;
	v = partition(nums , start , end) ;
	if(start < end) 
	    {
		System.out.println(toString(nums));
		quickHelp(nums, start , v);
		quickHelp(nums, v , end);
	    }
       
    }
	
	
    


    public static void main (String[] args) 
    {
	int[]a = new int[] {9999, 0 , 0 , 4 , 3, 99999 , 12 , 400 ,30};
	Quick.partition(a , 0 , 8);
	System.out.println(toString(a));
	System.out.println(" " );
	System.out.println(Quick.quickSelect(a , 4));
	Quick.quickSort(a);
	System.out.println(toString(a));
	

    }
}


			
	
	
	