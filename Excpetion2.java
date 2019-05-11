import java.util.*;
class Excpetion2{
	int facto(int x){
		int ans=1;
		if(x==1 ){
			return ans;
		}
		else{
			ans=x*facto(x-1);
		}
		return ans;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a;
	Excpetion2 ex=new Excpetion2();
	try{
		a=sc.nextInt();
		System.out.println("Factorial is "+ex.facto(a));
	}
	catch(Exception e){
		System.out.println("Not integer!");
	}

}
}