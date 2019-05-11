import java.util.*;

class ExceptionHandling{
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		float ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a b c d: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		
		if(b*c==0)
			throw new ArithmeticException("Ans is infnity");
		else
			ans=(a*d)+(b*c)/(d*b);
			System.out.println("Ans is "+ans);}
		
	
}