package arrays;

import java.util.Scanner;

public class MaximumNo {
	
	public static void main (String [] args)
	{
		int n, maximumno;
	Scanner s = new Scanner (System.in);
	
	n = s.nextInt();
	
	int a[] = new int[n];
	
	System.out.println ("Enter elements of array");
	
	for(int i = 0; i < n; i++) {
		a[i] = s.nextInt();
		
	}
	maximumno = a[0];
	
	for (int i = 0; i < n; i++)
	{
		if (maximumno < a[i])
			
		{
			maximumno = a [i];
			}
	}
		
	System.out.println (" maximum value :" +maximumno);
	}

}
