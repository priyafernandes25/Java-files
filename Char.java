import java.util.*;
import java.lang.*;

class Char{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		String s;
		if(c>=65 && c<=(65+25)){
			System.out.println("Character is an Alphabet");
			s=Character.toString(c);
			System.out.println("Character after changing case: "+s.toLowerCase());
		}

		if(c>=97 && c<=(97+25)){
			System.out.println("Character is an Alphabet");

			System.out.println("Character after changing case: "+Character.toUpperCase(c));
		}

		if(c>=48 && c<=57){
			System.out.println("Character is a Digit");
			
		}

		if(c==32){
			System.out.println("Character is a Space");
			
		}
	
	}
	
}