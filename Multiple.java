import java.util.*;

class Employee{
	int id;
	String name;
	Scanner sc=new Scanner(System.in);

	void getid(){
		System.out.println("Enter id and name: ");
		id=sc.nextInt();
		name=sc.next();
	}
}


interface Dep{
	int sal=10000;
	
	double hra=0.05*sal;
	double ta=0.1*sal;
	double da=0.15*sal;

	//void getsal();
}

class Salary extends Employee implements Dep{
	int nod;
	double tot=sal+ta+hra+da;

	Scanner sc=new Scanner(System.in);

	//void getsal(){
	//	System.out.println("Enter salary: ");
	//	sal=sc.nextInt();
	//}

	void getnod(){
		System.out.println("Enter salary: ");
		nod=sc.nextInt();


	}

	void display(){
		System.out.println(name+id+tot+nod);
	}
}

class Multiple{
	public static void main(String[] args) {
		Salary s=new Salary();
		s.getid();
		//s.getsal();
		s.getnod();
		s.display();
	}
}
