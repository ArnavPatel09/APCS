package myfirstpackage;

public class Lab5_ArrayFunctions 
{
	public static int min(int a, int b) 
	{
		if(a<b)//checks if a is less than b
			return a;//if so a is smaller and is returned
		else//if a is greater than b
			return b;//returns the smaller number(b)
	}//End min
	
	public static int min(int[] a) 
	{
		int rv = 1;//creates a return value
		boolean p = true;//creates a variable for true that way we can exit the loop anytime we want
		while(p) 
		{
			for(int i = 0; i< a.length-1 && p; i++) //for loop that continues to increase i until it is greater than
			{//or equal to the length of array a minus 1
				boolean z = true;//creates another variable so we can exit this when we need to
				int y = 0;//creates an integer y that stores the value 0
				while(z) 
				{
					if(y<a.length-1) //if y is less than the length of a minus 1
					{
						if(a[i]<=a[a.length-1-y])//check if a[i] is less than or equal to a[length of a minus 1 minus y]
							y++;//you increase y
						else
							z = false;//if not then you exit the 2nd while loop so that i can increase
						
					}
					else
					{
						rv = i;//once y is greater than a.length-1 then rv becomes the value of i(the indexnumber)
						z = false;//exits out of both while loops
						p = false;
					}
				}
			}
		}
		

		return a[rv];//returns the smallest integer
	}//End min (array)
	
	public static int[] add(int[] a, int[] b) 
	{
		int[] x;//creating a new array (size not determined)
		if(a.length>b.length) //checks which length is bigger
		{
			for(int i = 0; i<b.length; i++)//if b is less than a then all the numbers will be added to a
				a[i] += b[i];
			x = a;//then we set x to a
		}
		else 
		{
			for(int i = 0; i<a.length; i++)//if a is less than b then all the numbers will be added to b
				b[i] += a[i];
			x = b;//then we set x to b
		}
		return x;//returning the added array
	}//end add
	
	public static int mode(int[] a) 
	{
		int count;//this will be the counter for how many times a number repeats
		int repeater = -1;//this is to see which number actually repeats the most
		int rv = 0;//the index of the mode is stored here
		for(int i = 0; i < a.length; i++)//goes through the loop for every index
		{
			count = 0;//resets the count every time the index is changed
			for(int y = 0; y < a.length; y++) //goes through every number in the array
			{
				if(a[i] == a[y])//checks if they are equal
					count++;//increases the count(number of times that the number is repeated)
			}//problem with this is count will increase when they compare a[0] and a[0]
			count--;//so we get rid of this problem by subtracting 1
			if(repeater < count)//if the number of repeated is larger than previous then it will run the next few steps
			{
				repeater = count;//changes the repeater to the new mode.
				rv = i;//changes the index to the index of the mode
			}	
		}
		return a[rv];//returns the mode
	}//end mode
	
	//END MATH FUNCTIONS
	
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
	
	public static int[] copy(int[] a) 
	{
		int[] b = new int[a.length];//creates another array with the same length as the one passed in
		for(int i = 0; i < a.length; i++)//goes through each element
		{
			b[i] = a[i];//sets them equal to each other
		}
		//can't do b = a because if you change a it will change b and vise versa (you dont want that)
		//they are pointing to the same thing
		return b;//returns the new array
	}//End copy
	
	public static int[] resize(int[] a, int newLength) 
	{
		int[] spaceArray = new int[newLength];//creates a new array with the length passed in
		if(spaceArray.length>=a.length) // checks if the new array is larger than the one passed in
		{
			for(int i = 0; i<a.length; i++) //if so then we will go through each element
				spaceArray[i] = a[i];//and set each position equal to each other
			for(int x = a.length; x<spaceArray.length; x++ )
				spaceArray[x] = 0;//the rest will be filled with 0s
		}
		else //if space array is smaller than the array passed in
		{
			for(int i = 0; i<spaceArray.length; i++) //then we go through every index that
				//spaceArray can hold
				spaceArray[i] = a[i];//and set the values of the index equal to the array passed in
		}
		return spaceArray;//return the updated/new array	
	}//End resize
	
	public static int[] append(int[] a, int[] b) 
	{
		if(a == null)
			return b;
		if(b == null)
			return a;
		int length = a.length;
		length += b.length;
		int[] append = new int[length];//makes a new array with the length of a and b combined
		if(b.length>0)// if b has a length then it will go through here
		{
			for(int i = 0; i< b.length; i++)//goes through each index
			{
				append[i] = b[i];//makes all the elements in b equal to append
			}
			for(int x = 0; x<a.length; x++) //goes through each index
			{
				append[b.length+x] = a[x];//appends the elements in a to append
				//we add the length of b so that it doesnt replace all the b values
			}
		}
		else
			return a;// if b doesn't have a length then we just return a
		return append;//we then return the appended array
	}//End append
	
	public static int[] remove(int[] a, int index) 
	{
		int[] b = new int[a.length - 1];//creates an array with a size 1 less than array a
		for(int i = 0; i<index; i++) 
		{
			b[i] = a[i];//goes through everything before the index number
		}
		for(int y = index; y<b.length; y++) 
		{
			b[y] = a[y+1];//we do y+1 because u don't want the index number
		}
		return b;
	}
	
	public static int[] subArray(int[] a, int firstincluded, int firstExcluded)
	{
		int x = 0;//this will be the index number of the new array
		int[] b = new int[a.length - (a.length - firstExcluded)-firstincluded];//making the new array the desired size
		for(int i = firstincluded; i< firstExcluded; i++) //iterating through each index number inbetween included and excluded
		{
			b[x] = a[i];//setting the element in the given array to the appropriate index of the new array
			x++;//increasing x so that the other elements don't replace each other
		}
		return b;//return the new element
	}//End subArray
	//END GENERAL FUNCTIONS
	
	public static void makeSorted(int[] a) 
	{
		int storage = 0;//storage variable when we swap
		for(int i = 0; i<a.length-1; i++) //goes through each index except for the last one 
		{// just there to repeat the next for loop enough times
			for(int x = 0; x<a.length && x+1<a.length; x++) //goes through each index
			{
				if(a[x]>a[x+1]) //compares to see which one is greater the current number or the one after
				{
					storage = a[x];//if so then the variables are swapped
					a[x] = a[x+1];
					a[x+1] = storage;
				}//if not then we go to the next number
			}
		}
		System.out.print(prettyPrint(a));//then we print the sorted array out
	}//End makeSorted
	
	public static int[] sort(int[] a) 
	{
		int[] b = new int[a.length];//creates another array with the same length as the one given
		int storage = 0;//storage variable for swapping
		for(int y = 0; y<a.length; y++)// makes each element in b the same as a
			b[y] = a[y];//have to do this so we dont change array a
		for(int i = 0; i<b.length; i++) // this goes through the swapping the amount
		{// of times the length of the array is
			for(int x = 0; x<b.length && x+1<b.length; x++) //goes through each index
			{
				if(b[x]>b[x+1]) //compares to see which one is greater the current number or the one after
				{
					storage = b[x];//if so then the variables are swapped
					b[x] = b[x+1];
					b[x+1] = storage;
				}
			}
		}
		return b;//return the new sorted array
	}//End sort
	
	public static int[] merge(int[] a, int[] b) 
	{
		int[] rv = new int[a.length + b.length];//creates the return value array with the length of a and b combined
		int i = 0;//index of array a
		int x = 0;//index of array b
		int k = 0;//index of array rv

		   while (i < a.length && x < b.length) {
		       if (a[i] < b[x]) {//checks if which of the first elements is lower
		           rv[k] = a[i];//if its a[i] then the first element of the new array will be that value
		           i++;//it will now go to the next index number of array a
		       }
		       else {//if not b is smaller
		           rv[k] = b[x];//value of b will be put in the index of the new array
		           x++;//goes to the next element in array b
		       }
		       k++;//increases the index number of rv
		   }
		   while (i < a.length) {//if array a still has more elements
		       rv[k] = a[i];//then we keep appending the remaining elements in array a
		       i++;//increases index of array a
		       k++;//increase index of array rv
		   }
		   while (x < b.length) {//if array b stil has more elements
		       rv[k] = b[x];//then we keep appending the remaining elements in array b
		       x++;//increase index of array b
		       k++;//increase index of array rv
		   }

		   return rv;	
	}//End merge
	
	
	public static void main(String[] args) 
	{
		int[] a = {1,5,3,7,2,65,111,775,484};
		int[] b = {2,6,34,23,8,999,99,3,9};
		makeSorted(a);
		//System.out.print(prettyPrint(a));
	}

}
