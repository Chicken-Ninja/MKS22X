public class Merge{

    
    public static String toString(int[] r)
    {
	String dump = "[ "
	for(int counter = 0; counter < r.length; counter++ )
	    {
		dump = dump + r[counter];
		dump = dump + " ";
	    }
	return dump; 
    }

    public static void merge(int[]data ,int[]temp , int lo , int mid , int hi)
    {
        

    }

    
    public static void mergesort(int[] data)
    {
	int[]temp = new int[data.length];
	msort(data, temp , 0 , data.length -1 );
    }


    public static void msort(int[] data, int[] temp , int lo, int hi)
    {
	mid = lo/2 + hi/2; 
    }

}
