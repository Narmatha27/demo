package addon_dsa;

import java.util.Arrays;

public class Bubblesort {
	public static void findBubble(int[]sample)
	{
		System.out.println(Arrays.toString(sample));
	for(int i=1;i<sample.length;i++)
	{
		for(int j=0;j<sample.length-i;j++)
		{
			if(sample[j]>sample[j+1])
			{
				int temp = sample[j];
				sample[j]=sample[j+1];
				sample[j+1]=temp;
	        }
		}
		System.out.println(Arrays.toString(sample));
		
	}
	}
	public static void main(String args[])
	{
		int a[]= {23,3,75,44,55,9};
		findBubble(a);
	}
       
}
