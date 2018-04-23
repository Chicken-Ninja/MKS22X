public class StackCalc
{
    //String data;
    
    //int value = 0;

    

    public static double StackCalc(String datum)
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
			a.push(total);
		    }
		if(values[counter] == "-")
		    {
			total += a.pop() - a.pop();
			a.push(total);
			
		    }
		if(values[counter] == "*")
		    {
			total += a.pop() * a.pop();
			a.push(total);
		    }
		if(values[counter] == "/")
		    {
			total += a.pop() / a.pop();
			a.push(total);
		    }
		if(values[counter] == "%")
		    {
			total += a.pop() % a.pop();
			a.push(total);
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
	StackCalc a = new StackCalc("10 10 +");
	//System.out.println(a.StackCalc(" 10 10 10 + +" ));
    
    }
}
	//for(int counter = 0; counter < String.length(); counter ++)
	//	{
		    
		    
    
    
