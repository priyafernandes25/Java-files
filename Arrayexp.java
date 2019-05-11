import java.util.*;

class Arrayexp{
	int n;
	Scanner sc=new Scanner(System.in);
	int[] array;
	int[] flag;
	int[] newarr;

	void getArray(){
		System.out.print("Enter number of elements: ");
		n=sc.nextInt();
		array=new int[n];
		flag=new int[n];
		
		System.out.print("Enter  elements: ");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
	}

	void search(int index){
		int count=0;
		for(int i=index+1;i<n;i++){
			if(array[index]==array[i])
				count++;
		}

		if(count==0)
			flag[index]=1;
	}

	void eachElement(){
		for(int i=0;i<n;i++){
			search(i);
		}
	}

	void newArray(){
		int m=0;
		for(int i=0;i<n;i++){
			if(flag[i]==1)
				m++;
		}

		newarr=new int[m];
		int k=0;
		for(int i=0;i<n;i++){
			if(flag[i]==1){
				newarr[k]= array[i];
				k++;
			}
		}

	}


	void printNewArr(){
		int m=newarr.length;
		for(int i=0;i<m;i++)
			System.out.print(newarr[i]+"  ");
	}



	public static void main(String[] args) {
		
		Arrayexp a=new Arrayexp();
		a.getArray();
		a.eachElement();
		a.newArray();
		a.printNewArr();
		
	}
}
