import java.util.*;

class Array
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the numbers: ");
		for (int i=0 ;i<n ;i++ ) 
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Enter the number to be found : ");
		int x = sc.nextInt();
		int found=0, index=-1;
		for (int i=0 ;i<n ;i++ ) 
		{
			if(x==array[i])
			{
				found=1;
				index=i;
			}
		}
		if(found==1) System.out.println("Number found at position "+(index+1));
		else System.out.println("Number not found ");

	}
}