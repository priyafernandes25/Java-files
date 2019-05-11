import java.util.*;

class Student{
	String name;
	int rno;
	int nos;
	int[] marks;
	int[] maxmarks;
	Scanner sc=new Scanner(System.in);
	Student(String name, int rno,int nos){
		this.name=name;
		this.rno=rno;
		this.nos=nos;
		marks=new int[nos];
		maxmarks=new int[nos];
		System.out.println();
		for(int i=0;i<nos;i++){
			System.out.print("Hi "+name+" Enter marks and max marks of sub "+(i+1)+" ");
			marks[i]=sc.nextInt();
			maxmarks[i]=sc.nextInt();
		}
		System.out.println("Sucessfully done.");
	}

	float percent(){
		int sum=0;
		int total=0;
		for(int i=0;i<marks.length;i++){
			sum=sum+marks[i];
			total=total+maxmarks[i];
		}
		float cent=((sum*1.0f)/total)*100;
		return cent;
	}

	void classs(float cent){
		if(cent>=65)
			System.out.print("Class I");
		if(cent<65 && cent>=45)
			System.out.print("Class II");
		if(cent<45 && cent>=35)
			System.out.print("Class III");
		if(cent<35)
			System.out.print("Fail");
	}

	void display(){
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Rno: "+rno);
		System.out.println("No of subjects: "+nos);
		for(int i=0;i<marks.length;i++){
			System.out.println("Marks in subject no "+(i+1)+" : "+marks[i]+" / "+maxmarks[i]);
		}
		System.out.println("Percentage: "+percent());
		System.out.print("Class: ");
		classs(percent());
		System.out.println();

	}

	public static void main(String[] args) {
		int n=2;
		Student[] s=new Student[n];
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("Enter name rno ans nos: ");
			String name=sc1.next();
			int rno=sc1.nextInt();
			int nos=sc1.nextInt();
			s[i]=new Student(name,rno,nos);
		}

		for(int i=0;i<n;i++){
			s[i].display();
		}


		
	}
}