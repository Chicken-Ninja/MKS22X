public class Sorts <T extends Comparable <T>>
{

    MyHeap data;
    T[data.size()]sorty;
    int size = 0;  
    public Sorts()
    {
    }
    @SuppressWarnings("Unchecked")
    public void Heapify(T[] thing)
    {
        MyHeap a = (T[]) new Comparable[];
	for(int counter = 0; counter < thing.length; counter++ )
	    {
		a.add(thing[0]);
	    }
	data = a; 
    }

    
    
    public static void HeapSort()
    {
	
			
	
	
	
	
	
