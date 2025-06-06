package addon_dsa;

import java.util.Scanner;

public class sumofdigits {
	public static int num(int n)
	{
		int t,s = 0;
	    while(n>0)
	    {
	    	t=n%10;
	    	s=s+t;
	    	n=n/10;
	    	
	    }
		return s;
	    
	}
	public static void main(String args[])
	{
		
		System.out.println("enter n value:");
		Scanner a=new Scanner(System.in);
	    int n = a.nextInt();
	    int s = num(n);	
	    System.out.println("sum of individual digis "+s);
	}

}
