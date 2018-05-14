public class FrontierQueue implements Frontier
{
    Deque data = new Deque();

    public void add(Location e)
    {
	data.addLast(e);
    }

    
    public boolean hasNext()
    {
	if(data.peekFirst() == null)
	    {
		return false;
	    }
	return true;
    }
	
    

    public Location next()
    {
	return data.removeFirst();
    }
}
