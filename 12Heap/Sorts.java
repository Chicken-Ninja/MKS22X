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
	int counter = 0;
	int index1 = 0;
	int index2 = 0;
	while(size != data.size())
	    {
		if(index1 == 0 && index2 == 0)
		    {
			sorty[counter] = data[0];
			counter++;
			index1 = index1 * 2 + 1;
			index2 = index2 * 2 + 1;
			size++;

		    }
		else
		    {
			if(index1.compareTo(index2) > 1)
			    {
				sorty[counter] = data(index1);
				counter++;
				index1 = index1 * 2 + 1;
				
			
			
	
	
	
	
	
