//import java.lang.*;


public class Calculator{
    //String data;
    
    //int value = 0;

    

    public static double eval(String datum)
    {
        @SuppressWarnings("unchecked") Stack a  = new Stack();
	String values[] = datum.split(" ");
        //Double temp = 0;
	//Double temp2 = 0;
	double total = 0.0;
	double temp = 0;
	//	for(int counter = 0; counter < values.length; counter++ )
	//  {
	//System.out.println("o" + values[counter] + "o");
	// }

	for(int counter = 0; counter < values.length; counter++)
	    {
		String thing = values[counter];
		//if(thing.equals( "+")) 
		// {
		//	System.out.println("TRUE");
			
		//    }
	//else//
		//   {
			//    System.out.println("FALSE");
		//  }

		//System.out.println(thing);
		if(thing.equals( "+"))
		    {
			
			total += a.pop() + a.pop();
			a.push(total);
		    }
		else if(thing.equals("-"))
		    {
			total += a.pop() - a.pop();
			a.push(total);
			
		    }
		else if(thing.equals( "*"))
		    {
			total += a.pop() * a.pop();
			a.push(total);
		    }
		else if(thing.equals( "/"))
		    {
			total += a.pop() / a.pop();
			a.push(total);
		    }
		else if(thing.equals("%"))
		    {
			total += a.pop() % a.pop();
			a.push(total);
		    }
		
		else{
		    
		    temp = Double.parseDouble(thing);
		    //System.out.println(temp);
		    a.push(temp);
		}
		//System.out.println(counter);
		//System.out.println(a.peek());
		//System.out.println(total);
		//return total;
	    }
	return total;
    }
		

    public static void main(String[] args)
    {
	Calculator A = new Calculator();
	System.out.println(A.eval("10 11 +"));
	
	//System.out.println(a.StackCalc(" 10 10 10 + +" ));
    
    }
}
	//for(int counter = 0; counter < String.length(); counter ++)
	//	{
		    
		    
    
    
