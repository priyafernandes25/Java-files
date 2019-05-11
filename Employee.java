import java.util.*;

class Employee{

	StringBuffer name1;
	String name;
	String address;
	String sal;
	StringBuffer address1;
	int id;
	int salary;
	Scanner sc=new Scanner(System.in);
	StringBuffer sal1;
	Employee(){
		System.out.print("");
		System.out.print("Enter name adress id and salary: ");
		name=sc.next();
		address=sc.next();
		id=sc.nextInt();
		salary=sc.nextInt();
		sal=Integer.toString(salary);
		//System.out.print("SD");
		stringobj();
	}

	Employee(String name,String address,int id,int salary){
		this.name=name;
		this.address=address;
		this.id=id;
		this.salary=salary;
		sal=Integer.toString(salary);
		stringobj();

	}

	void stringobj(){
		name1=new StringBuffer(name);
		address1=new StringBuffer(address);
		sal1=new StringBuffer(sal);
	}

	void display(){
		System.out.println(name1+"\t"+address1+"\t"+sal1);
	}


	public static void main(String[] args) {
		int n=3;
		Employee[] e=new Employee[n];
		Employee temp=new Employee("t","t",0,0);
		for(int i=0;i<n;i++){
			e[i]=new Employee();
		}

		for(int i=0;i<=n-2;i++){
			for(int j=i+1;j<=n-1;j++){
				if(e[i].sal.compareTo(e[j].sal)>0){
					temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
		}

		for(int i=0;i<n;i++){
			e[i].display();
		}
	}
}