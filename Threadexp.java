import java.util.*;

class Even extends Thread{

	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}

		}

		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
	}

}

class Odd extends Thread{

	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
	}

}

class Months extends Thread{

	public void run(){
		String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int n=months.length;
		for(int i=0;i<n;i++){
			System.out.println(months[i]);
		}

		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
}}

public class Threadexp{
	public static void main(String[] args) {
		Even e=new Even();
		Odd o=new Odd();
		Months m=new Months();

		//e.start();
		//o.start();
		//m.start();
		m.setName("Months");
		System.out.println(m.getName());


	}
}




