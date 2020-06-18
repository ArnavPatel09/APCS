package myfirstpackage;

public class Array3by3 {
	public static String arrayToString(int[][] n) {
		if(n == null)
			return "null";
		String rv = "{";//starts the larger String
		for(int r = 0; r<n.length-1; r++) 
		{
			rv +="{" + n[r][0];// starts the smaller array and adds the first element
			for(int c = 1; c<n[r].length; c++)
				rv += ", " + n[r][c];// adds the rest of the elements in the array
			rv += "},\n ";//ends the smaller array
		}
		for(int r = n.length-1; r<n.length; r++) //adds last smaller array
		{
			rv += "{" + n[r][0];
			for(int c = 1; c<n[r].length; c++)
				rv += ", " + n[r][c];
			rv += "}";
		}
		rv += "}";//ends the larger array
		return rv;
	}//End arrayToString

	public static void pascalsTri(int n) {
		int[][] a = new int[n][];//creates the number of rows
		for(int i = 0; i<n; i++)//creates the number of spaces
			a[i] = new int[i+1];//for each row
		for(int i = 0; i<a.length; i++) {
			System.out.println("Length of row #" + i + "\t" + a[i].length);
		}
	}
	
	public static String prettyPrint(int[] a) 
	{
		String rv = "{";// this is the string with the return value
		for(int i = 0; i < a.length-1; i++) 
		{
			rv += a[i] + ", ";// this will append the number, a comma, and then a space for every element but the last one
		}
		rv += a[a.length-1] + "}";// this will append the last element with the end curly brace
		return rv;//returns the string
	}//end prettyPrint
	
	public static void main(String[] args) {

		
		int[][] array = new int [3][3];
		int x = 0;
		for(int r = 0; r<array.length; r++)
			for(int c = 0; c<array[r].length; c++) {
				array[r][c] = x*x;
				x++;
			}
		int[] sum = new int[3];
		for(int r = 0; r<array.length; r++)
			for(int c = 0; c<array[r].length; c++)
				sum[c] += array[r][c];
		System.out.println(arrayToString(array));
		System.out.println();
		System.out.println(prettyPrint(sum));
		
		//pascalsTri(4);
	}
}
