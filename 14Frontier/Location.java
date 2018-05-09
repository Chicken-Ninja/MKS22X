public class Location{
    private int x , y;
    private Location previous;
    
    public Location(int a , int b , Location prev) 
    {
	x = a;
	y = b;
	previous = prev; 
    }

    public int getX() 
    {
	return x;
    }
    
    public int getY() 
    {
	return y; 
    }
    
    public Location getPrev()
    {
        return previous; 
    }

			    





}