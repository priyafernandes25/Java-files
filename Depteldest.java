import java.util.*;

public class Depteldest{

	String name;
	String dept;
	int age;
	Scanner sc=new Scanner(System.in);
	
	
	void getDetails(){
		System.out.println("Enter name dept and age: ");
		name=sc.next();
		dept=sc.next();
		age=sc.nextInt();
	}

	void setDetails(){
		System.out.println();
		System.out.print(name+"		");
		System.out.print(dept+"		");
		System.out.print(age+"		");
		
	}

	public static void main(String[] args) {
		int n=4;
		Depteldest[] d=new Depteldest[n];
		int[] flag=new int[n];
		for(int i=0;i<d.length;i++){
			d[i]= new Depteldest();
			d[i].getDetails();
		}
		System.out.println();
		System.out.println("Dept\tMax Age");
		int max;
		
		for(int i=0;i<d.length;i++){
			if(flag[i]==1)
				continue;
			String depx=d[i].dept;
			//System.out.println("\n"+depx);
			max=d[i].age;
			for(int j=i+1;j<d.length;j++){

				if(depx.equals(d[j].dept)){

					if(d[j].age>max){

						max=d[j].age;
						System.out.println(max);
					}
					flag[j]=1;
				}
				
				
			}
			System.out.println(depx+"\t\t"+max);
			
		}

	}
}