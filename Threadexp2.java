import java.util.*;


class Square extends Thread{
	int num;
	Square(int n){
		num=n;
	}

	public void run(){
		int square=num*num;
		System.out.println("Even : "+num+" * "+num+" = "+square);
	}
}

class Cube extends Thread{
	int num;
	Cube(int n){
		num=n;
	}

	public void run(){
		int cube=num*num*num;
		System.out.println("Odd : "+num+" * "+num+" * "+num+" = "+cube);
	}
}

class Randomself extends Thread{
	public void run(){
		Random r=new Random();
		for(int i=0;i<5;i++){
		int num=r.nextInt(20);
		//int num=8;
		System.out.println("Number is "+num);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		if(num%2==1){
			Cube c= new Cube(num);
			c.start();
		}
		else{
			Square s=new Square(num);
			s.start();
		}
	}}
}


class Threadexp2{
	public static void main(String[] args) {
		Randomself obj=new Randomself();
		obj.start();
	}
}