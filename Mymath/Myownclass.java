package Mymath;


import java.util.*;

public class Myownclass{

	public int gcd(int a,int b){
		int ans=1;
		if(b==0)
			return a;
		else
			ans=gcd(b,a%b);
		return ans;


	}
}