import java.util.*;
import java.util.Arrays;



public class Sorts 
{
    
    public static void radixsort(MyLinkedListImproved<Integer> data)
    {
	int max = data.max();
	int maxdigits = data.digits(data);
	for(int counter=  0; counter < maxdigits ; counter++ ) 
	    {
		
		@SupressWarnings("unchecked") MyLinkedListImproved<Integer>[] thing = new MyLinkedListImproved<>[10];
		for(int stepper = 0; stepper < 10; stepper ++ ) 
		    {
			thing[stepper] = new MyLinkedListImproved<Integer>();
		    }
		
		
    
    





















    
	 public int digits (MyLinkedListImproved<Integer> data)
    {
	int largest = data.get(data.max());
	String thing = "" + largest; 
	return thing.length();
    }
    /*
    //public MyLinkedListImproved<String>[] sort(MyLinkedListImproved<String> 
	
	
	
    public static void radixsort(MyLinkedListImproved<Integer> data) 
    {
	int maxDigits = data.digits(data);
	String[] temp = new String[data.length];
	MyLinkedListImproved<Integer> datum = new MyLinkedListImproved<>();
	
	static Node current = data.first; 
	for(int counter = 0; counter < data.length; counter++ )
	    {
		temp[counter] = "" + current.getValue();
		current = current.getNext();
	    }
	for(int counter = 0; counter < temp.length; counter++ )
	    {
		int distance = maxDigits - temp[counter].length();
		for(int stepper = 0; stepper < distance; stepper++)
		    {
			temp[counter] = "0" + temp[counter];
		    }
	    }
	
	
    }
}					       
    */				       