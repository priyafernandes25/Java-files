import myPackage.Prime;
import myPackage.Fibonacci;
public class ThreadMainExample 
{  
	public static void main(String[] args)   
	{   
		myPackage.Prime p = new myPackage.Prime();   
		myPackage.Fibonacci f = new myPackage.Fibonacci();   
		p.start();   
		f.start();      
	} 
}