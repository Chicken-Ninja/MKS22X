public class Recursion {
    public int fact(int n){
	if (n < 0) {throw new IllegalArgumentException();} 
	if (n == 0) {return 1;}		       
	return n * fact(n - 1); }

    public int fib(int n) {
	if (n < 0) {throw new IllegalArgumentException();}
	if (n == 0) {return 0;} 
	if (n == 1) {return 1;} 
	return fib(n - 1) + fib(n - 2); }
    public double sqrt (double n) {
	if(n < 0) {throw new IllegalArgumentException();}
	return sqrthelp(n , 1);}
    public double sqrthelp( double n , double guess){
	if(n == 0) {return 0;}
	if(n < 0) {throw new IllegalArgumentException(); }
	if (guess * guess - n < 0.01 && guess * guess - n > -0.01)  {return guess;} 
	else{return sqrthelp(n , ((n / guess) + guess) / 2);}
	    //eh
    }
  

}
