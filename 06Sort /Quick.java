import java.util.*;
public class Quick{
    int[]nums;
    int value;
    public String toString() {
	String dump = ""; 
	for(int counter =  0; counter < nums.length; counter++ )
	    {dump = dump + nums[counter];}
	return dump;
    }

    public static void swap(int[] nums , int a , int b)
    {
	int placeholder = 0;
	placeholder = nums[a];
	nums[a] = nums[b];
	nums[b] = placeholder;
    }

    public void quickSort(int[] nums)
    {
    
    