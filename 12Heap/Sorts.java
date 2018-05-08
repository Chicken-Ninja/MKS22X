public class Sorts <T extends Comparable <T>>
{
    public Sorts() 
	{
	}
    
    public static void HeapSort(Integer[] temp) 
    {
	MyHeap<Integer> a = new MyHeap<>();
	a.Heapify(temp);
	for(int counter = 0; counter < a.size(); counter ++ )
	    {
		Integer b = a.remove();
		a.data[a.size()] = b;
	    }
    }
    




}





			
	
	
	
	
	
