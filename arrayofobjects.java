import java.util.*;

class arrayofobjects
{
	int accno,id;
	float balance;
	String name,acctype;
	Scanner s = new Scanner(System.in);
	
	void getAccount() throws Exception
	{ 
		System.out.print("Enter name, id, account no, account type and balance :");
		name=s.next();
		id=s.nextInt();
		accno=s.nextInt();
		acctype=s.next();
		balance=s.nextFloat();

	}

	void displayAccount()
	{	
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("Account number : " + accno);
		System.out.println("Account type : " + acctype);
		System.out.println("Balance : " + balance);

	}

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of customers: ");
		int n=sc.nextInt();
		arrayofobjects[] a = new arrayofobjects[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new arrayofobjects();
			System.out.println();
			System.out.println("For customer number "+(i+1)+" :");
			a[i].getAccount();
		}
		System.out.println();
		System.out.println("Data:");
		for(int i=0;i<n;i++)
		{
			System.out.println();
			System.out.println("For customer number "+(i+1)+" :");
			a[i].displayAccount();
		}
	}
}