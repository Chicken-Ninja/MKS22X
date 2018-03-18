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
	System.out.println(nums[pivot]);
	while(i <= gt) 
	    {
		System.out.println(toString(nums));
		System.out.println(i);
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
    
    return 0;
    }

    public static void main (String[] args) 
    {
	int[]a = new int[] {9999, 0 , 0 , 4 , 3, 99999 , 12 , 400 ,30};
	Quick.partition(a , 0 , 8);
	System.out.println(toString(a));
    }
}

			
	
	
	