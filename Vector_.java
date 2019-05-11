import java.util.*;

class Vector_{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("City");
		int a=2;
		Integer x=new Integer(a);
		//x=Integer.parseInt(a);
		v.add(a);
		System.out.println("Elenent at 1 "+v.elementAt(1));
		v.remove(1);
		System.out.println("Elenent at 1 "+v.size());

	}
}