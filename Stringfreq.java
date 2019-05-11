import java.util.*;

class Stringfreq{
	String s;
	StringBuffer sb;
	char c;
	Scanner sc=new Scanner(System.in);

	void getString(){
		s=new String(sc.next());
		sb=new StringBuffer(s);
		c=sc.next().charAt(0); 
	}

	void freq(){
		int count=0;
		char str[]=s.toCharArray();
		int n=str.length;
		for(int i=0;i<n;i++){
			if(c==str[i])
				count++;
		}
		System.out.println("Frequency: "+count);
	}

	void replace(){
		int n=s.length();
		sb.append(" ");
		System.out.println("Leng5h: "+n);
		String c1=Character.toString(c);
		for(int i=0;i<n;i++){
			System.out.println(i);

			if(sb.charAt(i)==c){
				System.out.println(sb.charAt(i));
				sb.delete(i,i+1);
				i=i-1;
				n=n-1;
				}
		}
		System.out.println("New String: "+sb);


	}

	void case1(){
		sb.replace(0,1,sb.substring(0,1).toUpperCase());
		System.out.println("New String: "+sb);
	}
	void sort(){
		char str[]=s.toCharArray();
		Arrays.sort(str);
		String s1=new String(str);
		System.out.println("Sorted String: "+s1);

	}



	public static void main(String[] args) {
		Stringfreq obj=new Stringfreq();
		obj.getString();
		obj.freq();
		obj.sort();
		obj.replace();
		obj.case1();
	}
}