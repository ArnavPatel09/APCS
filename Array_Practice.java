package myfirstpackage;

public class Array_Practice {
	//write a function that takes an array of integers as argument and returns
	//the number of elements in the array that are divisible by 3;
	public int[] someMethod(int[] array, int value) {
		for(int i= 1; i<array.length-1;i++)
			array[i-1] += value;
		return array;
	}
	public static int arrayDivThree(int[] a) 
	{
		int counter = 0;
		for(int i = 0; i<a.length; i++) 
		{
			if(a[i]%3 == 0)
				counter++;
		}
		return counter;
	}
	public static void bubbleSort(int ar[])
	{
	   int counter = 0;
	   for (int i = (ar.length - 1); i >= 0; i--)
	   {
		  //counter++;
	      for (int j = 1; j <= i; j++)
	      {
	    	 //counter++;
	         if (ar[j-1] > ar[j])
	         {
	              int temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	              counter++;
	         } 
	      } 
	   }
	   System.out.println("THIS IS THE NUMBER OF COMPARISONS " + counter);
	}
	
	public static void reverse(int[] a) {
		int storage;
		for(int i = 0; i<(a.length/2); i++) 
		{
			storage = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = storage;
			
		}
		
	}
	//find the highest and the lowest numbers of an array
	public static int missing(int[] a) 
	{
		if(a[0] != 1)
			return 1;
		if(a[1] != 2)
			return 2;
		for(int i = 2; i<a.length; i++) 
		{
			if((a[i]-1)%i != 0)
				return i+1;
		}
		return 0;
		
	}
	
	public static int highest(int[] a) 
	{
		int highest= Integer.MIN_VALUE;
		System.out.println(highest);
		for(int i = 0; i<a.length; i++) {
			if(a[i]>highest)
				highest = a[i];
		}
		return highest;
	}
	
	public static int lowest(int[] a) {
		int lowest = Integer.MAX_VALUE;
		for(int i = 0; i<a.length; i++) {
			if(a[i]<lowest)
				lowest = a[i];
		}
		return lowest;
	}

	public static void main(String[] args) 
	{
		//final int[] a1 = {1,2};
		int[] b1 = {1,2,3,4,5,6,8,9,10};
		System.out.print("The lowest number in the array is " + lowest(b1));
		//System.out.print("This array was missing the number " + missing(b1));
		//a1 = b1;
		//reverse(b1);
		//for(int i = 0; i<b1.length; i++)
			//System.out.print(b1[i] + " ");
	}
	

}
