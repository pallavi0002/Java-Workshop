package Recursion;

public class RecursiveFunction {
	
	static int count= 0;
	void ShowArray();
	int array[] = {1,2,3,4,5,6};
	System.out.println(array[count]);
	if (count<array.length) {
		count++;
		showArray();
	}

}


