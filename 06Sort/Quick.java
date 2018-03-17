import java.util.*;
public class Quick{
    int[]thing;
    int value;
    Random rand = new Random();

   

    public String toString() {
	String dump = ""; 
	for(int counter = 0; counter < thing.length; counter++ )
	    {dump = dump + thing[counter];}
	return dump;
    }

    public static void swap(int[] nums , int a , int b)
    {
	int placeholder;
	placeholder = nums[b];
	nums[b] = nums[a];
	nums[a] = placeholder;
    }

    public void quickSort(int[] nums) 
    {
	int low = 0;
	int i = low + 1;
	int high = nums.length - 1; 
	int v = rand.nextInt(nums.length - 1) + 1; 
	int bottom = low + 1; 
	int top = high; 
	while(i <= top)
	    {
		if(nums[i] > nums[v]) 
		    {
			swap(nums,i,low);
			top--;
		    }
		else if(nums[i] < nums[low]) 
		    {
			i++;
		    }
	    }
	thing = nums;   
    }
}
			
	
	