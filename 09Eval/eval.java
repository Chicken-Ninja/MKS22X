public class eval
{
    //String data;
    
    //int value = 0;

    

    public static double eval(String datum)
    {
        @SuppressWarnings("unchecked") Stack a  = new Stack();
	String values[] = datum.split(" ");
        //Double temp = 0;
	//Double temp2 = 0;
	double total = 0.0;

	for(int counter = 0; counter < values.length; counter++)
	    {
		if(values[counter] == "+")
		    {
			total += a.pop() + a.pop();
		    }
		if(values[counter] == "-")
		    {
			total += a.pop() - a.pop();
		    }
		if(values[counter] == "*")
		    {
			total += a.pop() * a.pop();
		    }
		if(values[counter] == "/")
		    {
			total += a.pop() / a.pop();
		    }
		if(values[counter] == "%")
		    {
			total += a.pop() % a.pop();
		    }
		else
		    {
			a.push(Double.parseDouble(values[counter]));
		    }
		//return total;
	    }
	return total;
    }
		

    public static void main(String[] args)
    {
	eval a = new eval();
	System.out.println(a.eval(" 10 10 10 + +" ));
    
    }
}
	//for(int counter = 0; counter < String.length(); counter ++)
	//	{
		    
		    
    
    
