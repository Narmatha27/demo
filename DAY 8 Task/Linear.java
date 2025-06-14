package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
	public static void main(String args[])
	{
		int arr[]= {3,4,5,7,89,};
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the numebers:");
		int n=sc.nextInt();
				
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Value found:"+" "+arr[i]+" "+"at"+" "+i);
			}
		}
		System.out.println("not found");
	}
	

}
